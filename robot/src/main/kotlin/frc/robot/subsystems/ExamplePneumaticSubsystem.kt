// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot.subsystems

import edu.wpi.first.wpilibj2.command.SubsystemBase
import edu.wpi.first.wpilibj.Compressor
import edu.wpi.first.wpilibj.DoubleSolenoid.Value.*
import edu.wpi.first.wpilibj.DoubleSolenoid

class ExamplePneumaticSubsystem(val output: DoubleSolenoid) : SubsystemBase() {

    fun setForward(){
        output.set(kForward)
    }
    fun setReverse(){
        output.set(kReverse)
    }
    fun setOff(){
        output.set(kOff)
    }

    fun set(state: DoubleSolenoid.Value) {
        output.set(state)
    }

    override fun periodic() {
        // This method will be called once per scheduler run
    }

    override fun simulationPeriodic() {
        // This method will be called once per scheduler run during simulation
    }
}