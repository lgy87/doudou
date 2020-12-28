(ns doudou.app
  "Example of `re-frame-simple`, an alternate `re-frame` syntax for simple use cases."
     (:require [reagent.core :as r]
            [reagent.dom :as rd]))


 
(defn root-view []
  [:h1  {:style {:color "purple"}} "23"])

(defn ^:export render []
  (rd/render [root-view]
                  (js/document.getElementById "root")))

 
(defn ^:before-load stop []
  (js/console.log "stop"))

(defn ^:dev/after-load start []
  (js/console.log "ok")
  (render))

(defn ^:export init 
  []
  (render))
