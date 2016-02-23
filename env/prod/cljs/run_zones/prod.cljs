(ns run-zones.prod
  (:require [run-zones.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
