cmake_minimum_required(VERSION 3.10)
PROJECT(vehicle_diagnostics)
file(GLOB C_SRCS "*.cpp")
add_executable(${PROJECT_NAME} ${C_SRCS})
install(TARGETS ${PROJECT_NAME} DESTINATION bin)
install(FILES logfile.log
        DESTINATION bin
)