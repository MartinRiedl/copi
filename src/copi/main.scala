/**
 * COPI is a tool for setting a timedrift between different 
 * image sets by its exif-information and sort them chronologically
 * 
 * Copyright (C) 2009  Martin Riedl
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package copi 

import logic._
import rendering._

object main extends SICApplicationLogic {

  /*
  def defineObjectGraph() = {
    val directories = Array(//"/home/riedl/Bilder/2009.05.23 Nassereith/Max",
                            //"/home/riedl/Bilder/2009.05.23 Nassereith/Martin/EOS400d",
                            //"/home/riedl/Bilder/2009.05.23 Nassereith/Martin/IXUS55",
                            //"/home/riedl/Bilder/2009.05.23 Nassereith/Klaus",
                            "/home/riedl/Bilder/2009.05.23 Nassereith/Kathrin",
                            "/home/riedl/Bilder/2009.05.23 Nassereith/Daniel")
    
    // put all successful generated timelines from the given array of directories into a new project
    SIC_Project((for (d<-directories) yield generateTimeline(d).toList).flatMap((a)=>a))                          
  }*/
 
  def main(args : Array[String]) : Unit = {
    //tex = Some(defineObjectGraph())
    render	    
  }
}



