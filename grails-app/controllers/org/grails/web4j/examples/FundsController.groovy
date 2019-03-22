package org.grails.web4j.examples

import generated.greeter.Greeter
import grails.converters.JSON
import grails.web.Controller
import groovy.transform.CompileStatic
import org.grails.web3j.example.EthereumService
import org.web3j.protocol.core.methods.response.TransactionReceipt
import org.web3j.utils.Convert

@CompileStatic
@Controller
class FundsController {

    EthereumService ethereumService

    def index() { }


    def transferFunds(String toAddress, String weiAmount) {

        log.info("Sending ${weiAmount} Wei (${Convert.fromWei(weiAmount, Convert.Unit.ETHER).toPlainString()}  Ether)")
        TransactionReceipt receipt = ethereumService.sendFunds(toAddress,new BigDecimal(weiAmount), Convert.Unit.WEI)
        log.info("Transaction complete, view it at https://rinkeby.etherscan.io/tx/"
                + receipt.getTransactionHash());
        receipt as JSON
    }
}
