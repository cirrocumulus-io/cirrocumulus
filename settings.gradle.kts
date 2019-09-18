rootProject.name = "cirrocumulus"

fun includeModule(name: String) {
    val projectName = "${rootProject.name}-$name"
    include(projectName)
    val project = project(":$projectName")
    project.projectDir = File(name)
    project.buildFileName = "$name.gradle.kts"
}

arrayOf("api", "cli").forEach { includeModule(it) }
