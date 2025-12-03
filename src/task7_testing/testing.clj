(ns testing
  (:require [clojure.string :as str]))

;; Task 7 – Functions for Testing


;; A simple add function
(defn add [a b]
  (+ a b))

;; A function that checks if a number is even
(defn is-even? [n]
  (even? n))

;; A function that capitalizes a name
(defn format-name [name]
  (str/capitalize name))

;; A function that throws an error for negative numbers
(defn safe-square [n]
  (if (< n 0)
    (throw (Exception. "Negative numbers not allowed"))
    (* n n)))
;; ---------------------------------------------------------
