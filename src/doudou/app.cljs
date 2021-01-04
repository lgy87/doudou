(ns doudou.app
  (:require ["@blueprintjs/core" :refer [Button Tabs Tab]]))

(defn app []
  [:> Tabs {:id "tabs" :selectedTabId "rx" :vertical true}
   [:> Tab {:id "ng" :title "angular"}]
   [:> Tab {:id "rx" :title "react"}]])