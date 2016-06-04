(ns gm-familiar.handlers
    (:require [re-frame.core :as re-frame]
              [gm-familiar.db :as db]))

(re-frame/register-handler
 :initialize-db
 (fn  [_ _]
   db/default-db))
