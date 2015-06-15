(defproject com.jme3-contribution/lemur "0.1.0-SNAPSHOT"
  :description "A native GUI framework for jME3"
  :url "http://jmonkeyengine.org"
  :license {:name "Contact JMonkeyEngine for license details"
            :url "http://jmonkeyengine.org"}
  
  :repositories [["jme3" "http://updates.jmonkeyengine.org/maven/"]]
  
  :java-source-paths ["java"]
  
  :dependencies [[org.clojure/clojure "1.6.0"]
                 
                 ; - real tools
                 [org.slf4j/slf4j-api "1.7.12"]
                 [com.google.guava/guava "18.0"]
                 
                 ; - jme
                 [com.jme3/jme3-core "3.0.10"]
                 [com.jme3/jme3-effects "3.0.10"]
                 [com.jme3/jme3-networking "3.0.10"]
                 [com.jme3/jme3-plugins "3.0.10"]
                 [com.jme3/jme3-jogg "3.0.10"]
                 [com.jme3/jme3-terrain "3.0.10"]
                 [com.jme3/jme3-blender "3.0.10"]
                 [com.jme3/jme3-jbullet "3.0.10"]
                 [com.jme3/jme3-bullet "3.0.10"]
                 [com.jme3/jme3-bullet-natives "3.0.10"]
                 [com.jme3/jme3-bullet-natives-android "3.0.10"]
                 [com.jme3/jme3-desktop "3.0.10"]
                 [com.jme3/jme3-lwjgl "3.0.10"]
                 
                 [com.jme3/jme3-android "3.0.10"]
                 [com.jme3/jme3-ios "3.0.10"]
                 
                 [com.jme3-lib/lwjgl-natives "2.9.0"]
                 [com.jme3-lib/lwjgl "2.9.0"]
                 [com.jme3-lib/oggd "1.0.0"]
                 [com.jme3-lib/jinput "2.0.0-b01"]
                 [com.jme3-lib/jbullet "3.0.10-jme"]
                 
])
