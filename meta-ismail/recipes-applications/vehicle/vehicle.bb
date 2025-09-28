LICENSE = "CLOSED"

SRC_URI = " \
    file://CMakeLists.txt \
    file://main.cpp \
    file://Adaptive_Crusie_Control.cpp \
    file://Adaptive_Crusie_Control.hpp \
    file://Battery_Sensor.cpp \
    file://Battery_Sensor.hpp \
    file://Diagnostics.cpp \
    file://Diagnostics.hpp \
    file://Radar_Sensor.cpp \
    file://Radar_Sensor.hpp \
    file://Speed_Sensor.cpp \
    file://Speed_Sensor.hpp \
    file://Temperature_Sensor.cpp \
    file://Temperature_Sensor.hpp \
    file://logger.cpp \
    file://logger.hpp \
    file://logfile.log \
    file://Sensor.hpp \
    file://Vehicle.cpp \
    file://Vehicle.hpp \
"

S = "${WORKDIR}"  
inherit cmake

# FILES:${PN} += "${bindir}/logfile.log"