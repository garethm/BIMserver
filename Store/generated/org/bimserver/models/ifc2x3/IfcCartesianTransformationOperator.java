/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.models.ifc2x3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Cartesian Transformation Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator#getAxis1 <em>Axis1</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator#getAxis2 <em>Axis2</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator#getLocalOrigin <em>Local Origin</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator#getScale <em>Scale</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator#getScaleAsString <em>Scale As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcCartesianTransformationOperator()
 * @model
 * @generated
 */
public interface IfcCartesianTransformationOperator extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Axis1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis1</em>' reference.
	 * @see #isSetAxis1()
	 * @see #unsetAxis1()
	 * @see #setAxis1(IfcDirection)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcCartesianTransformationOperator_Axis1()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcDirection getAxis1();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator#getAxis1 <em>Axis1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis1</em>' reference.
	 * @see #isSetAxis1()
	 * @see #unsetAxis1()
	 * @see #getAxis1()
	 * @generated
	 */
	void setAxis1(IfcDirection value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator#getAxis1 <em>Axis1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAxis1()
	 * @see #getAxis1()
	 * @see #setAxis1(IfcDirection)
	 * @generated
	 */
	void unsetAxis1();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator#getAxis1 <em>Axis1</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Axis1</em>' reference is set.
	 * @see #unsetAxis1()
	 * @see #getAxis1()
	 * @see #setAxis1(IfcDirection)
	 * @generated
	 */
	boolean isSetAxis1();

	/**
	 * Returns the value of the '<em><b>Axis2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis2</em>' reference.
	 * @see #isSetAxis2()
	 * @see #unsetAxis2()
	 * @see #setAxis2(IfcDirection)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcCartesianTransformationOperator_Axis2()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcDirection getAxis2();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator#getAxis2 <em>Axis2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis2</em>' reference.
	 * @see #isSetAxis2()
	 * @see #unsetAxis2()
	 * @see #getAxis2()
	 * @generated
	 */
	void setAxis2(IfcDirection value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator#getAxis2 <em>Axis2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAxis2()
	 * @see #getAxis2()
	 * @see #setAxis2(IfcDirection)
	 * @generated
	 */
	void unsetAxis2();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator#getAxis2 <em>Axis2</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Axis2</em>' reference is set.
	 * @see #unsetAxis2()
	 * @see #getAxis2()
	 * @see #setAxis2(IfcDirection)
	 * @generated
	 */
	boolean isSetAxis2();

	/**
	 * Returns the value of the '<em><b>Local Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Origin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Origin</em>' reference.
	 * @see #setLocalOrigin(IfcCartesianPoint)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcCartesianTransformationOperator_LocalOrigin()
	 * @model
	 * @generated
	 */
	IfcCartesianPoint getLocalOrigin();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator#getLocalOrigin <em>Local Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Origin</em>' reference.
	 * @see #getLocalOrigin()
	 * @generated
	 */
	void setLocalOrigin(IfcCartesianPoint value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcCartesianTransformationOperator_Scale()
	 * @model
	 * @generated
	 */
	float getScale();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(float value);

	/**
	 * Returns the value of the '<em><b>Scale As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale As String</em>' attribute.
	 * @see #setScaleAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcCartesianTransformationOperator_ScaleAsString()
	 * @model
	 * @generated
	 */
	String getScaleAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator#getScaleAsString <em>Scale As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale As String</em>' attribute.
	 * @see #getScaleAsString()
	 * @generated
	 */
	void setScaleAsString(String value);

	/**
	 * Returns the value of the '<em><b>Dim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dim</em>' attribute.
	 * @see #setDim(int)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcCartesianTransformationOperator_Dim()
	 * @model derived="true"
	 * @generated
	 */
	int getDim();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator#getDim <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dim</em>' attribute.
	 * @see #getDim()
	 * @generated
	 */
	void setDim(int value);

} // IfcCartesianTransformationOperator