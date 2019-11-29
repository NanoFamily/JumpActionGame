package jp.techacademy.ito.hiroki.jumpactiongame

import com.badlogic.gdx.graphics.Texture

class Enemy(texture: Texture, srcX: Int, srcY: Int, srcWidth: Int, srcHeight: Int)
    : GameObject(texture, srcX, srcY, srcWidth, srcHeight) {

    companion object {
        // 横幅、高さ
        val ENEMY_WIDTH =  1.6f
        val ENEMY_HEIGHT = 1.8f
    }

    init {
        setSize(ENEMY_WIDTH, ENEMY_HEIGHT)
    }

}