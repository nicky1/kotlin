/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.js.test.semantics;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/box/bridges")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class BridgeTestGenerated extends AbstractBridgeTest {
    @TestMetadata("objectClone.kt")
    public void ignoredObjectClone() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/objectClone.kt");
        doTest(fileName);
    }

    public void testAllFilesPresentInBridges() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/box/bridges"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("complexMultiInheritance.kt")
    public void testComplexMultiInheritance() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/complexMultiInheritance.kt");
        doTest(fileName);
    }

    @TestMetadata("complexTraitImpl.kt")
    public void testComplexTraitImpl() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/complexTraitImpl.kt");
        doTest(fileName);
    }

    @TestMetadata("delegation.kt")
    public void testDelegation() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/delegation.kt");
        doTest(fileName);
    }

    @TestMetadata("delegationComplex.kt")
    public void testDelegationComplex() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/delegationComplex.kt");
        doTest(fileName);
    }

    @TestMetadata("delegationComplexWithList.kt")
    public void testDelegationComplexWithList() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/delegationComplexWithList.kt");
        doTest(fileName);
    }

    @TestMetadata("delegationProperty.kt")
    public void testDelegationProperty() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/delegationProperty.kt");
        doTest(fileName);
    }

    @TestMetadata("diamond.kt")
    public void testDiamond() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/diamond.kt");
        doTest(fileName);
    }

    @TestMetadata("fakeCovariantOverride.kt")
    public void testFakeCovariantOverride() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/fakeCovariantOverride.kt");
        doTest(fileName);
    }

    @TestMetadata("fakeGenericCovariantOverride.kt")
    public void testFakeGenericCovariantOverride() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/fakeGenericCovariantOverride.kt");
        doTest(fileName);
    }

    @TestMetadata("fakeGenericCovariantOverrideWithDelegation.kt")
    public void testFakeGenericCovariantOverrideWithDelegation() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/fakeGenericCovariantOverrideWithDelegation.kt");
        doTest(fileName);
    }

    @TestMetadata("fakeOverrideOfTraitImpl.kt")
    public void testFakeOverrideOfTraitImpl() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/fakeOverrideOfTraitImpl.kt");
        doTest(fileName);
    }

    @TestMetadata("fakeOverrideWithSeveralSuperDeclarations.kt")
    public void testFakeOverrideWithSeveralSuperDeclarations() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/fakeOverrideWithSeveralSuperDeclarations.kt");
        doTest(fileName);
    }

    @TestMetadata("fakeOverrideWithSynthesizedImplementation.kt")
    public void testFakeOverrideWithSynthesizedImplementation() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/fakeOverrideWithSynthesizedImplementation.kt");
        doTest(fileName);
    }

    @TestMetadata("genericProperty.kt")
    public void testGenericProperty() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/genericProperty.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1939.kt")
    public void testKt1939() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/kt1939.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1959.kt")
    public void testKt1959() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/kt1959.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2498.kt")
    public void testKt2498() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/kt2498.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2702.kt")
    public void testKt2702() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/kt2702.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2833.kt")
    public void testKt2833() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/kt2833.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2920.kt")
    public void testKt2920() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/kt2920.kt");
        doTest(fileName);
    }

    @TestMetadata("kt318.kt")
    public void testKt318() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/kt318.kt");
        doTest(fileName);
    }

    @TestMetadata("longChainOneBridge.kt")
    public void testLongChainOneBridge() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/longChainOneBridge.kt");
        doTest(fileName);
    }

    @TestMetadata("manyTypeArgumentsSubstitutedSuccessively.kt")
    public void testManyTypeArgumentsSubstitutedSuccessively() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/manyTypeArgumentsSubstitutedSuccessively.kt");
        doTest(fileName);
    }

    @TestMetadata("methodFromTrait.kt")
    public void testMethodFromTrait() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/methodFromTrait.kt");
        doTest(fileName);
    }

    @TestMetadata("noBridgeOnMutableCollectionInheritance.kt")
    public void testNoBridgeOnMutableCollectionInheritance() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/noBridgeOnMutableCollectionInheritance.kt");
        doTest(fileName);
    }

    @TestMetadata("overrideAbstractProperty.kt")
    public void testOverrideAbstractProperty() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/overrideAbstractProperty.kt");
        doTest(fileName);
    }

    @TestMetadata("overrideReturnType.kt")
    public void testOverrideReturnType() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/overrideReturnType.kt");
        doTest(fileName);
    }

    @TestMetadata("propertyAccessorsWithoutBody.kt")
    public void testPropertyAccessorsWithoutBody() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/propertyAccessorsWithoutBody.kt");
        doTest(fileName);
    }

    @TestMetadata("propertyDiamond.kt")
    public void testPropertyDiamond() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/propertyDiamond.kt");
        doTest(fileName);
    }

    @TestMetadata("propertyInConstructor.kt")
    public void testPropertyInConstructor() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/propertyInConstructor.kt");
        doTest(fileName);
    }

    @TestMetadata("propertySetter.kt")
    public void testPropertySetter() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/propertySetter.kt");
        doTest(fileName);
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/simple.kt");
        doTest(fileName);
    }

    @TestMetadata("simpleEnum.kt")
    public void testSimpleEnum() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/simpleEnum.kt");
        doTest(fileName);
    }

    @TestMetadata("simpleGenericMethod.kt")
    public void testSimpleGenericMethod() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/simpleGenericMethod.kt");
        doTest(fileName);
    }

    @TestMetadata("simpleObject.kt")
    public void testSimpleObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/simpleObject.kt");
        doTest(fileName);
    }

    @TestMetadata("simpleReturnType.kt")
    public void testSimpleReturnType() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/simpleReturnType.kt");
        doTest(fileName);
    }

    @TestMetadata("simpleTraitImpl.kt")
    public void testSimpleTraitImpl() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/simpleTraitImpl.kt");
        doTest(fileName);
    }

    @TestMetadata("simpleUpperBound.kt")
    public void testSimpleUpperBound() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/simpleUpperBound.kt");
        doTest(fileName);
    }

    @TestMetadata("strListContains.kt")
    public void testStrListContains() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/strListContains.kt");
        doTest(fileName);
    }

    @TestMetadata("traitImplInheritsTraitImpl.kt")
    public void testTraitImplInheritsTraitImpl() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/traitImplInheritsTraitImpl.kt");
        doTest(fileName);
    }

    @TestMetadata("twoParentsWithDifferentMethodsTwoBridges.kt")
    public void testTwoParentsWithDifferentMethodsTwoBridges() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/twoParentsWithDifferentMethodsTwoBridges.kt");
        doTest(fileName);
    }

    @TestMetadata("twoParentsWithTheSameMethodOneBridge.kt")
    public void testTwoParentsWithTheSameMethodOneBridge() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/twoParentsWithTheSameMethodOneBridge.kt");
        doTest(fileName);
    }

    @TestMetadata("compiler/testData/codegen/box/bridges/substitutionInSuperClass")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class SubstitutionInSuperClass extends AbstractBridgeTest {
        @TestMetadata("abstractFun.kt")
        public void testAbstractFun() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/substitutionInSuperClass/abstractFun.kt");
            doTest(fileName);
        }

        public void testAllFilesPresentInSubstitutionInSuperClass() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/box/bridges/substitutionInSuperClass"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("boundedTypeArguments.kt")
        public void testBoundedTypeArguments() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/substitutionInSuperClass/boundedTypeArguments.kt");
            doTest(fileName);
        }

        @TestMetadata("delegation.kt")
        public void testDelegation() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/substitutionInSuperClass/delegation.kt");
            doTest(fileName);
        }

        @TestMetadata("enum.kt")
        public void testEnum() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/substitutionInSuperClass/enum.kt");
            doTest(fileName);
        }

        @TestMetadata("genericMethod.kt")
        public void testGenericMethod() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/substitutionInSuperClass/genericMethod.kt");
            doTest(fileName);
        }

        @TestMetadata("object.kt")
        public void testObject() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/substitutionInSuperClass/object.kt");
            doTest(fileName);
        }

        @TestMetadata("property.kt")
        public void testProperty() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/substitutionInSuperClass/property.kt");
            doTest(fileName);
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/substitutionInSuperClass/simple.kt");
            doTest(fileName);
        }

        @TestMetadata("upperBound.kt")
        public void testUpperBound() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/bridges/substitutionInSuperClass/upperBound.kt");
            doTest(fileName);
        }
    }
}
