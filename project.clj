(defproject cpjhellodb "0.1.0-SNAPSHOT"
  :description "sample Clojure/Compojure app with database"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies
  [
   ;http://clojure.org/downloads
   [org.clojure/clojure "1.10.0"]
   ;https://github.com/clojure/tools.nrepl
   [org.clojure/tools.nrepl "0.2.13"]
   ;https://github.com/weavejester/compojure
   [compojure "1.6.1"]
   ;https://github.com/cgrand/enlive
   [enlive "1.1.6"]
   ;https://github.com/ring-clojure/ring
   [ring/ring-defaults "0.3.2"]
   ;https://github.com/clojure/data.json/
   [org.clojure/data.json "2.4.0"]
   ;https://github.com/clj-time/clj-time
   [clj-time "0.15.2"]
   ;https://github.com/clojure/java.jdbc
   [org.clojure/java.jdbc "0.7.12"]
   ;http://dev.mysql.com/downloads/connector/j/
   [mysql/mysql-connector-java "8.0.27"]
   ;https://github.com/michaelklishin/monger
   [com.novemberain/monger "3.5.0"]
   ]
  :plugins
  [[lein-ring "0.12.5"]]
  :ring {:handler cpjhellodb.handler/app
         :port 8080}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.2"]]}})
