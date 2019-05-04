package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

   lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onBeginnerClicked(view:View){
        ballerSkillButton.isChecked = false
        player.skill = "beginner"

    }

    fun onBallerClicked(view:View){
        beginnerSkillButton.isChecked = false
        player.skill = "baller"
    }

    fun onSkillFinishClicked(view: View){
        if(player.skill != ""){
            val finishActivityIntent = Intent(this,FinishActivity::class.java)
            finishActivityIntent.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivityIntent)
        }else {
            Toast.makeText(this,"Please select a skill level.",Toast.LENGTH_SHORT).show()
        }


    }


}
