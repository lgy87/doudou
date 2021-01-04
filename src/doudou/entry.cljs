(ns doudou.entry
  (:require [reagent.dom :as rd]
            [doudou.init]
            [doudou.app :refer [app]]))

(defn ^:export render
  []
  (rd/render [app]
             (js/document.getElementById "root")))

(defn ^:before-load stop []
  (js/console.log "stop"))

(defn ^:dev/after-load start []
  (render))
