/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.models.ifc2x3.impl;

import org.bimserver.models.ifc2x3.Ifc2x3Package;
import org.bimserver.models.ifc2x3.IfcDoorPanelOperationEnum;
import org.bimserver.models.ifc2x3.IfcDoorPanelPositionEnum;
import org.bimserver.models.ifc2x3.IfcDoorPanelProperties;
import org.bimserver.models.ifc2x3.IfcShapeAspect;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Door Panel Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcDoorPanelPropertiesImpl#getPanelDepth <em>Panel Depth</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcDoorPanelPropertiesImpl#getPanelDepthAsString <em>Panel Depth As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcDoorPanelPropertiesImpl#getPanelOperation <em>Panel Operation</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcDoorPanelPropertiesImpl#getPanelWidth <em>Panel Width</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcDoorPanelPropertiesImpl#getPanelWidthAsString <em>Panel Width As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcDoorPanelPropertiesImpl#getPanelPosition <em>Panel Position</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcDoorPanelPropertiesImpl#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDoorPanelPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcDoorPanelProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDoorPanelPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPanelDepth() {
		return (Float)eGet(Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties_PanelDepth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanelDepth(float newPanelDepth) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties_PanelDepth(), newPanelDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPanelDepth() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties_PanelDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPanelDepth() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties_PanelDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPanelDepthAsString() {
		return (String)eGet(Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties_PanelDepthAsString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanelDepthAsString(String newPanelDepthAsString) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties_PanelDepthAsString(), newPanelDepthAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPanelDepthAsString() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties_PanelDepthAsString());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPanelDepthAsString() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties_PanelDepthAsString());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorPanelOperationEnum getPanelOperation() {
		return (IfcDoorPanelOperationEnum)eGet(Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties_PanelOperation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanelOperation(IfcDoorPanelOperationEnum newPanelOperation) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties_PanelOperation(), newPanelOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPanelWidth() {
		return (Float)eGet(Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties_PanelWidth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanelWidth(float newPanelWidth) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties_PanelWidth(), newPanelWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPanelWidth() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties_PanelWidth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPanelWidth() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties_PanelWidth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPanelWidthAsString() {
		return (String)eGet(Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties_PanelWidthAsString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanelWidthAsString(String newPanelWidthAsString) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties_PanelWidthAsString(), newPanelWidthAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPanelWidthAsString() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties_PanelWidthAsString());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPanelWidthAsString() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties_PanelWidthAsString());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorPanelPositionEnum getPanelPosition() {
		return (IfcDoorPanelPositionEnum)eGet(Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties_PanelPosition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanelPosition(IfcDoorPanelPositionEnum newPanelPosition) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties_PanelPosition(), newPanelPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShapeAspect getShapeAspectStyle() {
		return (IfcShapeAspect)eGet(Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties_ShapeAspectStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapeAspectStyle(IfcShapeAspect newShapeAspectStyle) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties_ShapeAspectStyle(), newShapeAspectStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShapeAspectStyle() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties_ShapeAspectStyle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShapeAspectStyle() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcDoorPanelProperties_ShapeAspectStyle());
	}

} //IfcDoorPanelPropertiesImpl