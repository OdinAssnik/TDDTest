package io.libs 

// Выполняет команду и возвращает статус операции
//
// Параметры:
//  command - строка команды, которую нужно выполнить
//  workDir  - рабочий каталог для команды 
//
// Возвращаемое значение
//  Integer - код выполнения операции
//
def cmd(command, workDir = "") {
    
    //if (!workDir.isEmpty()) {
    //    command = "${getWorkspaceLine(workDir)} ${command}"
    //}

    def returnCode = 0
    returnCode = bat script: "chcp 65001\n${command}", returnStatus: true

    return returnCode
}