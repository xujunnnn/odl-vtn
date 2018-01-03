/*
* Generated file
*
* Generated from: yang module name: vtn-provider yang module local name: vtn-provider
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Wed Jan 03 00:36:40 PST 2018
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209;

import org.opendaylight.controller.config.spi.Module;
import org.opendaylight.controller.config.api.ModuleIdentifier;

@org.opendaylight.yangtools.yang.binding.annotations.ModuleQName(namespace = "urn:opendaylight:vtn:impl:provider", name = "vtn-provider", revision = "2015-02-09")

public abstract class AbstractVTNProviderModuleFactory implements org.opendaylight.controller.config.spi.ModuleFactory {
    public static final java.lang.String NAME = "vtn-provider";

    private static final java.util.Set<Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface>> serviceIfcs;

    @Override
    public final String getImplementationName() {
        return NAME;
    }

    static {
        serviceIfcs = java.util.Collections.emptySet();
    }

    @Override
    public final boolean isModuleImplementingServiceInterface(Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface> serviceInterface) {
        for (Class<?> ifc: serviceIfcs) {
            if (serviceInterface.isAssignableFrom(ifc)){
                return true;
            }
        }
        return false;
    }

    @Override
    public java.util.Set<Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface>> getImplementedServiceIntefaces() {
        return serviceIfcs;
    }

    @Override
    public org.opendaylight.controller.config.spi.Module createModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.osgi.framework.BundleContext bundleContext) {
        return instantiateModule(instanceName, dependencyResolver, bundleContext);
    }

    @Override
    public org.opendaylight.controller.config.spi.Module createModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.controller.config.api.DynamicMBeanWithInstance old, org.osgi.framework.BundleContext bundleContext) throws Exception {
        org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.VTNProviderModule oldModule;
        try {
            oldModule = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.VTNProviderModule) old.getModule();
        } catch(Exception e) {
            return handleChangedClass(dependencyResolver, old, bundleContext);
        }
        org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.VTNProviderModule module = instantiateModule(instanceName, dependencyResolver, oldModule, old.getInstance(), bundleContext);

        return module;
    }

    public org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.VTNProviderModule instantiateModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.VTNProviderModule oldModule, java.lang.AutoCloseable oldInstance, org.osgi.framework.BundleContext bundleContext) {
        return new org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.VTNProviderModule(new org.opendaylight.controller.config.api.ModuleIdentifier(NAME, instanceName), dependencyResolver, oldModule, oldInstance);
    }

    public org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.VTNProviderModule instantiateModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.osgi.framework.BundleContext bundleContext) {
        return new org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.VTNProviderModule(new org.opendaylight.controller.config.api.ModuleIdentifier(NAME, instanceName), dependencyResolver);
    }

    public org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.VTNProviderModule handleChangedClass(org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.controller.config.api.DynamicMBeanWithInstance old, org.osgi.framework.BundleContext bundleContext) throws Exception {
        String instanceName = old.getModule().getIdentifier().getInstanceName();
        org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.VTNProviderModule newModule = new org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.VTNProviderModule(new ModuleIdentifier(NAME, instanceName), dependencyResolver);
        Module oldModule = old.getModule();
        Class<? extends Module> oldModuleClass = oldModule.getClass();

        return newModule;
    }

    @Deprecated
    public org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.VTNProviderModule handleChangedClass(org.opendaylight.controller.config.api.DynamicMBeanWithInstance old) throws Exception {
        throw new UnsupportedOperationException("Class reloading is not supported");
    }

    @Override
    public java.util.Set<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.VTNProviderModule> getDefaultModules(org.opendaylight.controller.config.api.DependencyResolverFactory dependencyResolverFactory, org.osgi.framework.BundleContext bundleContext) {
        return new java.util.HashSet<>();
    }

}
