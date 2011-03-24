/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.models.ifc2x3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Air Terminal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcAirTerminalType#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcAirTerminalType()
 * @model
 * @generated
 */
public interface IfcAirTerminalType extends IfcFlowTerminalType {
	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc2x3.IfcAirTerminalTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcAirTerminalTypeEnum
	 * @see #setPredefinedType(IfcAirTerminalTypeEnum)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcAirTerminalType_PredefinedType()
	 * @model
	 * @generated
	 */
	IfcAirTerminalTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcAirTerminalType#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcAirTerminalTypeEnum
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcAirTerminalTypeEnum value);

} // IfcAirTerminalType