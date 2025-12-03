(ns testing-test
  (:require [clojure.test :refer :all]
            [testing :refer :all]))

(defn- add [arg1 arg2]
  )

;; Task 7 – Test Suite Using clojure.test
;; Author: Kritika

(deftest test-add
  (testing "Addition function"
    (is (= 15 (add 10 5)))
    (is (= 0 (add -2 2)))))

(defn- is-even? [arg1]
  )

(deftest test-even
  (testing "Even number check"
    (is (true? (is-even? 4)))
    (is (false? (is-even? 5)))))

(defn- format-name [arg1]
  )

(deftest test-format-name
  (testing "String capitalization"
    (is (= "Kritika" (format-name "kritika")))
    (is (= "Clojure" (format-name "clojure")))))

(defn- safe-square [arg1]
  )

(deftest test-safe-square
  (testing "Square with error handling"
    (is (= 49 (safe-square 7)))
    (is (thrown? Exception (safe-square -5)))))
