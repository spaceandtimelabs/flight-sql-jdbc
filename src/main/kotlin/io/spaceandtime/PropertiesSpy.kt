package io.spaceandtime

import org.slf4j.LoggerFactory
import java.util.*
import java.util.function.BiConsumer

class PropertiesSpy : Properties() {
    val log = LoggerFactory.getLogger(this.javaClass.name)

    override fun get(key: Any?): Any? {
        log.info("get($key)")
        return super.get(key)
    }

    override fun getOrDefault(key: Any?, defaultValue: Any?): Any {
        log.info("getOrDefault($key, $defaultValue)")
        return super.getOrDefault(key, defaultValue)
    }

    override fun getProperty(key: String?): String {
        log.info("getProperty($key)")
        return super.getProperty(key)
    }

    override fun getProperty(key: String?, defaultValue: String?): String {
        log.info("getOrDefault($key, $defaultValue)")
        return super.getProperty(key, defaultValue)
    }

    override fun contains(key: Any?): Boolean {
        log.info("contains($key)")
        return super.contains(key)
    }

    override fun containsKey(key: Any?): Boolean {
        log.info("containsKey($key)")
        return super.containsKey(key)
    }

    override fun containsValue(value: Any?): Boolean {
        log.info("containsValue($value)")
        return super.containsValue(value)
    }

    override fun propertyNames(): Enumeration<*> {
        log.info("propertyNames()")
        return super.propertyNames()
    }

    override fun stringPropertyNames(): MutableSet<String> {
        log.info("stringPropertyNames()")
        return super.stringPropertyNames()
    }

    override fun keys(): Enumeration<Any> {
        log.info("keys()")
        return super.keys()
    }

    override fun elements(): Enumeration<Any> {
        log.info("elements()")
        return super.elements()
    }

    override fun forEach(p0: BiConsumer<in Any, in Any>) {
        log.info("forEach()")
        super.forEach(p0)
    }
}