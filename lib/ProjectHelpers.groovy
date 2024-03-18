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
def loadCfgFrom1CStorage() {
    utils = new Utils()

    //returnCode = utils.cmd("runner loadrepo --storage-name ${storageTCP} --storage-user ${storageUser} ${storagePwdLine} --ibconnection ${connString} --db-user ${admin1cUser} --db-pwd ${admin1cPassword} ${platformLine}")
    //if (returnCode != 0) {
    //     utils.raiseError("Загрузка конфигурации из 1С хранилища  ${storageTCP} завершилась с ошибкой. Для подробностей смотрите логи.")
    //}
}