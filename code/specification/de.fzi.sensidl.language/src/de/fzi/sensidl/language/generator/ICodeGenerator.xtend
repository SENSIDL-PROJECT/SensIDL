package de.fzi.sensidl.language.generator

interface ICodeGenerator {
	def void generateDTO(); 
	def void generateEncoder();
	def void generateDecoder();
}