package xyz.akirin.korgelin

import net.minecraftforge.fml.common.Mod

@Mod(
        modid = Kpatch.MOD_ID,
        name = Kpatch.NAME,
        version = Kpatch.VERSION,
        acceptableRemoteVersions = "*",
        acceptedMinecraftVersions = "*",
        modLanguageAdapter = "net.toliner.korgelin.KotlinAdapter"
)
object Kpatch {
    const val MOD_ID = "korgelin-patch"
    const val NAME = "rei's korgelin patch"
    const val VERSION = "rei.1"
}