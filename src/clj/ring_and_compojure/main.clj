(ns ring-and-compojure.main
  (:require [com.stuartsierra.component :as component]
            [ring-and-compojure.system :as system])
  (:gen-class :main true))

(def id "ring-and-compojure")
(def port 8080)
(def config {:id id :port port})

(defn -main
  [& args]
  (if (= (count args) 0)
    (do (component/start-system (system/system config))
        @(promise))
    (println (str "Usage: java -jar " id ".jar server"))))
