project( cliente )
cmake_minimum_required(VERSION 2.8)

include("config/config.cmake")
include("config/deps.cmake")

add_executable( cliente src/main.cpp )
target_link_libraries( cliente ${DEPS_LIBS} )

# Instrucciones de instalación
install(TARGETS cliente RUNTIME DESTINATION bin)

