(ns doudou.app
  (:require ["@blueprintjs/core" :refer [Button Tabs Tab]]
            ["react" :as React :refer [createElement]]
            [reagent.core :as r]
            ["react-router-dom" :refer [BrowserRouter Routes Route]]))

(defn app []
  [:> BrowserRouter
   [:> Routes
    [:> Route {:path "/playgrounds/:id" :element (r/as-element [:h1 "lgy"])}]
    [:> Route {:path "/" :element (r/as-element [:h1 "hello, welcome!"])}]]])