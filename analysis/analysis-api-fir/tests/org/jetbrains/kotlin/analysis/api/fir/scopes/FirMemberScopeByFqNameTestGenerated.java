/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.scopes;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link GenerateNewCompilerTests.kt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/scopes/memberScopeByFqName")
@TestDataPath("$PROJECT_ROOT")
public class FirMemberScopeByFqNameTestGenerated extends AbstractFirMemberScopeByFqNameTest {
    @Test
    public void testAllFilesPresentInMemberScopeByFqName() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/scopes/memberScopeByFqName"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("ClassWithGenericBase1.kt")
    public void testClassWithGenericBase1() throws Exception {
        runTest("analysis/analysis-api/testData/scopes/memberScopeByFqName/ClassWithGenericBase1.kt");
    }

    @Test
    @TestMetadata("ClassWithGenericBase2.kt")
    public void testClassWithGenericBase2() throws Exception {
        runTest("analysis/analysis-api/testData/scopes/memberScopeByFqName/ClassWithGenericBase2.kt");
    }

    @Test
    @TestMetadata("ClassWithGenericBase3.kt")
    public void testClassWithGenericBase3() throws Exception {
        runTest("analysis/analysis-api/testData/scopes/memberScopeByFqName/ClassWithGenericBase3.kt");
    }

    @Test
    @TestMetadata("ClassWithGenericBase4.kt")
    public void testClassWithGenericBase4() throws Exception {
        runTest("analysis/analysis-api/testData/scopes/memberScopeByFqName/ClassWithGenericBase4.kt");
    }

    @Test
    @TestMetadata("Implement_java_util_Collection.kt")
    public void testImplement_java_util_Collection() throws Exception {
        runTest("analysis/analysis-api/testData/scopes/memberScopeByFqName/Implement_java_util_Collection.kt");
    }

    @Test
    @TestMetadata("Int.kt")
    public void testInt() throws Exception {
        runTest("analysis/analysis-api/testData/scopes/memberScopeByFqName/Int.kt");
    }

    @Test
    @TestMetadata("java.lang.String.kt")
    public void testJava_lang_String() throws Exception {
        runTest("analysis/analysis-api/testData/scopes/memberScopeByFqName/java.lang.String.kt");
    }

    @Test
    @TestMetadata("kotlin.Function2.kt")
    public void testKotlin_Function2() throws Exception {
        runTest("analysis/analysis-api/testData/scopes/memberScopeByFqName/kotlin.Function2.kt");
    }

    @Test
    @TestMetadata("MutableList.kt")
    public void testMutableList() throws Exception {
        runTest("analysis/analysis-api/testData/scopes/memberScopeByFqName/MutableList.kt");
    }

    @Test
    @TestMetadata("overridenFunctionWithGenericBound.kt")
    public void testOverridenFunctionWithGenericBound() throws Exception {
        runTest("analysis/analysis-api/testData/scopes/memberScopeByFqName/overridenFunctionWithGenericBound.kt");
    }
}
