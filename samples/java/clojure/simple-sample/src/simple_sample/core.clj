(ns simple-sample.core
  (:import [org.opencv.core Mat MatOfByte CvType Size]
           org.opencv.highgui.Highgui
           org.opencv.imgproc.Imgproc)
  (:require [seesaw.core :as ssc]
            [clojure.java.io :as io]))


(defn read-image 
  
  [filepath]
  (Highgui/imread filepath))



