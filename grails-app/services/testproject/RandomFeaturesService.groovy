package testproject

import grails.transaction.Transactional

@Transactional
class RandomFeaturesService {

    def doRandomFeatures() {
        println "This is a 'develop' feature!"

        println "Zombies!!!!"
        println "More zombies!!!"

        println "Have some cats!"

        println "And here are some dogs"
        println "Even more dogs"
    }
}
