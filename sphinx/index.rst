.. test_page documentation master file, created by
   sphinx-quickstart on Wed Mar 18 17:03:45 2015.
   You can adapt this file completely to your liking, but it should at least
   contain the root `toctree` directive.

Structure-oriented smoothing of 2D & 3D images on the GPU
=========================================================

.. toctree::
   :maxdepth: 3

*March 20, 2015*

This page describes the code I wrote for my undergraduate thesis while in my final year as an undergraduate 
at Colorado School of Mines. The code is found in two different git repositories
on |location_link|. The final working code and demo
is found within my fork of the Mines Java Tool Kit created by |dhale| (my advisor for this 
project). This is the `jtk` repository and  my test and other code is found within the 
`Senior_Design` repository.

.. |location_link| raw:: html

   <a href="https://github.com/ke0m" target="_blank">my GitHub page</a> 

.. |dhale| raw:: html

   <a href="https://inside.mines.edu/~dhale/" target="_blank">Professor Dave Hale</a>


Installation
------------

The instructions for installing the working code and demo
can be found in the README file on this |webpage|.

.. |webpage| raw:: html

   <a href="https://github.com/ke0m/jtk" target="_blank">web page</a>

Introduction
------------

Geoscientists use seismic images to better understand the subsurface geology of a given region. The proper 
interpretation of these images is key in creating an accurate geologic model to make predictions on the location
of hydrocarbon reservoirs. This interpretation can be time-consuming and a major bottleneck in the process of 
creating geologic models [Fehmers-Hocker]_. 
Applying image processing algorithms can aid in speeding up this interpretation as they
can remove unwanted noise and help delineate subtle yet important geologic features. One of these algorithms is 
known as structure-oriented smoothing [Fehmers-Hocker]_. The application of this filter to a seismic image will smooth
along the geologic structure in the image rather than across it in order to enhance the structural features. In Figure 1 
below, this can be seen in action on a 2D seismic image.

(Insert animated GIF here)





Structure-oriented smoothing
----------------------------


GPU Implementation
------------------

