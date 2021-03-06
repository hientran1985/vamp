package io.vamp.container_driver.marathon.api

import io.vamp.container_driver.ContainerPortMapping

case class MarathonApp(
  id: String,
  container: Option[Container],
  instances: Int,
  cpus: Double,
  mem: Int,
  env: Map[String, String],
  cmd: Option[String],
  args: List[String] = Nil,
  constraints: List[List[String]] = Nil)

case class Container(docker: Docker, `type`: String = "DOCKER")

case class Docker(image: String, portMappings: List[ContainerPortMapping], parameters: List[DockerParameter], privileged: Boolean, network: String = "BRIDGE")

case class DockerParameter(key: String, value: String)
