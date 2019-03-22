package org.grails.web4j.examples


import generated.greeter.Greeter
import grails.converters.JSON
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.grails.web3j.example.EthereumService
import org.web3j.protocol.core.methods.response.TransactionReceipt


@CompileStatic
class GreeterController {

    EthereumService ethereumService


    def deployGreeterContract(String greeting) {

        Greeter greeter = ethereumService.deployGreeterContract(greeting)
        greeter as JSON

    }

    def updateGreeting(String greeting) {
        TransactionReceipt receipt = ethereumService.updateGreeting(greeting)
        receipt as JSON
    }

    def getUpdatedEvents(TransactionReceipt receipt) {
        ethereumService.getUpdatedEvents(receipt) as JSON
    }
}
