// cerner_2^5_2019

import groovy.json.JsonOutput

class Addr{
    def ip
    def checkIp(){
        def regex = "(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])"
        return ip.matches(regex);
    }

}

def arr = [new Addr(ip:"223.255.123.123"), new Addr(ip:"001.000.123.123"),
           new Addr(ip:"191.255.009.200"), new Addr(ip:"323.255.123.123"),
           new Addr(ip:"223.259.123.123"), new Addr(ip:"1223.255.123.123")]

def results = arr*.checkIp()

//[true, true, true, false, false, false]
print JsonOutput.prettyPrint(JsonOutput.toJson(results))