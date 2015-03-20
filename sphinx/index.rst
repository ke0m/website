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

Installation
------------

The instructions for installing the working code and demo
can be found in the README file on this |webpage|.

Introduction
------------
In order to better understand the subsurface, scientists and engineers use geophysics to make an image of the 
subsurface geology. For example, using the seismic reflection method, we can send seismic 
waves into the subsurface and measure the traveltime and amplitudes of their reflections off of subsurface strata 
and other geologic features. The time series that represents the different reflected arrivals at the surface receiver
location is known as a seismogram. Therefore, for a large number of receivers, we can record a large number of 
seismograms, each one carrying unique information of the measured seismic wavefield at that surface location.  In 
Figure 1 below, we observe


Structure-oriented smoothing
^^^^^^^^^^^^^^^^^^^^^^^^^^^


.. |location_link| raw:: html

   <a href="https://github.com/ke0m" target="_blank">my GitHub page</a> 

.. |dhale| raw:: html

   <a href="https://inside.mines.edu/~dhale/" target="_blank">Professor Dave Hale</a>

.. |webpage| raw:: html

   <a href="https://github.com/ke0m/jtk" target="_blank">web page</a>



