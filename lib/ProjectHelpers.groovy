package io.libs 

// Загружает в базу конфигурацию из 1С хранилища. Базу желательно подключить к хранилищу под загружаемым пользователем,
//  т.к. это даст буст по скорости загрузки.
//
// Параметры:
//
//
//def loadCfgFrom1CStorage(storageTCP, storageUser, storagePwd, connString, admin1cUser, admin1cPassword, platform) {
//    utils = new Utils()
//
//    storagePwdLine = ""
//    if (storagePwd != null && !storagePwd.isEmpty()) {
//        storagePwdLine = "--storage-pwd ${storagePwd}"
//    }
//
//    platformLine = ""
//    if (platform != null && !platform.isEmpty()) {
//        platformLine = "--v8version ${platform}"
//    }
//
//    returnCode = utils.cmd("runner loadrepo --storage-name ${storageTCP} --storage-user ${storageUser} ${storagePwdLine} --ibconnection ${connString} --db-user ${admin1cUser} --db-pwd ${admin1cPassword} ${platformLine}")
//    if (returnCode != 0) {
//         utils.raiseError("Загрузка конфигурации из 1С хранилища  ${storageTCP} завершилась с ошибкой. Для подробностей смотрите логи.")
//    }
//}

// Загружает в базу конфигурацию из 1С хранилища. Базу желательно подключить к хранилищу под загружаемым пользователем,
//  т.к. это даст буст по скорости загрузки.
//
// Параметры:
//
//
def loadCfgFrom1CStorage(platform1c, storages1cPath, storageUser, storagePassword, ibConnection, ibUser, ibPassword) {
    utils = new Utils()

    //returnCode = utils.cmd("runner loadrepo --storage-name ${storageTCP} --storage-user ${storageUser} ${storagePwdLine} --ibconnection ${connString} --db-user ${admin1cUser} --db-pwd ${admin1cPassword} ${platformLine}")

   returnCode = utils.cmd("runner loadrepo --storage-name ${storages1cPath} --storage-user ${storageUser} ${storagePassword} --ibconnection ${ibConnection} --db-user ${ibUser} --db-pwd ${db-pwd} ${ibPassword}")

    if (returnCode != 0) {
         utils.raiseError("Загрузка конфигурации из 1С хранилища  ${storages1cPath} завершилась с ошибкой. Для подробностей смотрите логи.")
    }

}

// Обновляет базу в режиме конфигуратора. Аналог нажатия кнопки f7
//
// Параметры:
//
//  ibConnection - строка соединения, например /Sdevadapter\template_adapter_adapter
//  platform - полный номер платформы 1с
//  admin1cUser - администратор базы
//  admin1cPassword - пароль администратора базы
//
def updateInfobase(v8version, ibConnection, ibUser, ibPassword) {

    utils = new Utils()

     admin1cUserLine = "";
    if (!ibUser.isEmpty()) {
        admin1cUserLine = "--db-user ${ibUser}"
    }
    admin1cPassLine = "";
    if (!ibPassword.isEmpty()) {
        admin1cPassLine = "--db-pwd ${ibPassword}"
    }
    platformLine = ""
    if (platform != null && !v8version.isEmpty()) {
        platformLine = "--v8version ${platform}"
    }

    returnCode = utils.cmd("runner updatedb --ibconnection ${ibConnection} ${admin1cUserLine} ${admin1cPassLine} ${v8version}")

    if (returnCode != 0) {
        utils.raiseError("Обновление базы ${ibConnection} в режиме конфигуратора завершилось с ошибкой. Для дополнительной информации смотрите логи")
    }
}