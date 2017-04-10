(ns example.system
  (:require [compojure.core :refer [defroutes GET]]
            [compojure.route :as route]
            [example.service :as service]
            [taoensso.timbre :as log]))

(defroutes app
  (GET "/" [] "<h1>Hello World</h1>")
  (route/not-found "<h1>Page not found</h1>"))

(defn system
  [config]
  {:app (service/jetty-service config app)})
