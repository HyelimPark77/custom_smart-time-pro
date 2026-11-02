.class public final Lcom/sma/smartv3/model/LanguageTranslationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLanguageTranslation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageTranslation.kt\ncom/sma/smartv3/model/LanguageTranslationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,646:1\n1#2:647\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLanguageTranslation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageTranslation.kt\ncom/sma/smartv3/model/LanguageTranslationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,646:1\n1#2:647\n*E\n"
    }
.end annotation


# static fields
.field private static final languageList:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/sma/smartv3/model/LanguageTranslationKt;->languageList:Ljava/util/ArrayList;

    return-void
.end method

.method public static final clearTranslationLanguageList()V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/model/LanguageTranslationKt;->languageList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public static final detectLanguage(Ljava/lang/String;)Ljava/lang/String;
    .locals 71
    .param p0    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "text"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const-string v2, "unknown"

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    const/16 v3, 0xe0

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v4

    const/16 v5, 0xe2

    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v5

    const/16 v36, 0xe7

    invoke-static/range {v36 .. v36}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v6

    const/16 v37, 0xe8

    invoke-static/range {v37 .. v37}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v7

    const/16 v38, 0xe9

    invoke-static/range {v38 .. v38}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v8

    const/16 v39, 0xea

    invoke-static/range {v39 .. v39}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v9

    const/16 v40, 0xeb

    invoke-static/range {v40 .. v40}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v10

    const/16 v11, 0xee

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v41, 0xef

    invoke-static/range {v41 .. v41}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    const/16 v42, 0xf4

    invoke-static/range {v42 .. v42}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v13

    const/16 v43, 0xf9

    invoke-static/range {v43 .. v43}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v14

    const/16 v15, 0xfb

    invoke-static {v15}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v15

    const/16 v44, 0xfc

    invoke-static/range {v44 .. v44}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v16

    const/16 v17, 0xff

    invoke-static/range {v17 .. v17}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v17

    const/16 v18, 0x153

    invoke-static/range {v18 .. v18}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v18

    const/16 v19, 0xe6

    invoke-static/range {v19 .. v19}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v19

    const/16 v45, 0xc0

    invoke-static/range {v45 .. v45}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v20

    const/16 v21, 0xc2

    invoke-static/range {v21 .. v21}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v21

    const/16 v46, 0xc7

    invoke-static/range {v46 .. v46}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v22

    const/16 v47, 0xc8

    invoke-static/range {v47 .. v47}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v23

    const/16 v48, 0xc9

    invoke-static/range {v48 .. v48}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v24

    const/16 v49, 0xca

    invoke-static/range {v49 .. v49}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v25

    const/16 v50, 0xcb

    invoke-static/range {v50 .. v50}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v26

    const/16 v27, 0xce

    invoke-static/range {v27 .. v27}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v27

    const/16 v28, 0xcf

    invoke-static/range {v28 .. v28}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v28

    const/16 v29, 0xd4

    invoke-static/range {v29 .. v29}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v29

    const/16 v30, 0xd9

    invoke-static/range {v30 .. v30}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v30

    const/16 v31, 0xdb

    invoke-static/range {v31 .. v31}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v31

    const/16 v51, 0xdc

    invoke-static/range {v51 .. v51}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v32

    const/16 v33, 0x178

    invoke-static/range {v33 .. v33}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v33

    const/16 v34, 0x152

    invoke-static/range {v34 .. v34}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v34

    const/16 v35, 0xc6

    invoke-static/range {v35 .. v35}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v35

    filled-new-array/range {v4 .. v35}, [Ljava/lang/Character;

    move-result-object v4

    invoke-static {v4}, Lcom/android/mltcode/paycertificationapi/m54;->XX0([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    const/16 v5, 0xe4

    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v6

    const/16 v5, 0xf6

    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v7

    invoke-static/range {v44 .. v44}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v8

    const/16 v5, 0xdf

    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v9

    const/16 v5, 0xc4

    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v10

    const/16 v5, 0xd6

    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    invoke-static/range {v51 .. v51}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    filled-new-array/range {v6 .. v12}, [Ljava/lang/Character;

    move-result-object v5

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/m54;->XX0([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    const/16 v6, 0xe1

    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v7

    invoke-static/range {v38 .. v38}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v8

    const/16 v6, 0xed

    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v9

    const/16 v6, 0xf3

    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v10

    const/16 v11, 0xfa

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    invoke-static/range {v44 .. v44}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    const/16 v13, 0xf1

    invoke-static {v13}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v13

    const/16 v14, 0xbf

    invoke-static {v14}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v14

    const/16 v15, 0xa1

    invoke-static {v15}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v15

    const/16 v16, 0xc1

    invoke-static/range {v16 .. v16}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v16

    invoke-static/range {v48 .. v48}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v17

    const/16 v18, 0xcd

    invoke-static/range {v18 .. v18}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v18

    const/16 v23, 0xd3

    invoke-static/range {v23 .. v23}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v19

    const/16 v20, 0xda

    invoke-static/range {v20 .. v20}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v20

    invoke-static/range {v51 .. v51}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v21

    const/16 v22, 0xd1

    invoke-static/range {v22 .. v22}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v22

    filled-new-array/range {v7 .. v22}, [Ljava/lang/Character;

    move-result-object v7

    invoke-static {v7}, Lcom/android/mltcode/paycertificationapi/m54;->XX0([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    const/16 v8, 0xe3

    invoke-static {v8}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v51

    const/16 v8, 0xf5

    invoke-static {v8}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v52

    const/16 v8, 0xe1

    invoke-static {v8}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v53

    invoke-static/range {v38 .. v38}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v54

    const/16 v8, 0xed

    invoke-static {v8}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v55

    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v56

    const/16 v8, 0xfa

    invoke-static {v8}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v57

    invoke-static/range {v39 .. v39}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v58

    invoke-static/range {v42 .. v42}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v59

    invoke-static/range {v36 .. v36}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v60

    const/16 v8, 0xc3

    invoke-static {v8}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v61

    const/16 v8, 0xd5

    invoke-static {v8}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v62

    const/16 v8, 0xc1

    invoke-static {v8}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v63

    invoke-static/range {v48 .. v48}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v64

    const/16 v8, 0xcd

    invoke-static {v8}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v65

    invoke-static/range {v23 .. v23}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v66

    const/16 v8, 0xda

    invoke-static {v8}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v67

    invoke-static/range {v49 .. v49}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v68

    const/16 v8, 0xd4

    invoke-static {v8}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v69

    invoke-static/range {v46 .. v46}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v70

    filled-new-array/range {v51 .. v70}, [Ljava/lang/Character;

    move-result-object v8

    invoke-static {v8}, Lcom/android/mltcode/paycertificationapi/m54;->XX0([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    const/16 v9, 0x11f

    invoke-static {v9}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v10

    const/16 v9, 0x11e

    invoke-static {v9}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v9, 0x131

    invoke-static {v9}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    const/16 v9, 0x130

    invoke-static {v9}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v13

    const/16 v9, 0x15f

    invoke-static {v9}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v14

    const/16 v9, 0x15e

    invoke-static {v9}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v15

    invoke-static/range {v36 .. v36}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v16

    invoke-static/range {v46 .. v46}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v17

    filled-new-array/range {v10 .. v17}, [Ljava/lang/Character;

    move-result-object v9

    invoke-static {v9}, Lcom/android/mltcode/paycertificationapi/m54;->XX0([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v10

    invoke-static/range {v37 .. v37}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    invoke-static/range {v38 .. v38}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    const/16 v3, 0xec

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v13

    const/16 v3, 0xf2

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v14

    invoke-static/range {v43 .. v43}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v15

    invoke-static/range {v45 .. v45}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v16

    invoke-static/range {v47 .. v47}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v17

    invoke-static/range {v48 .. v48}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v18

    const/16 v3, 0xcc

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v19

    const/16 v3, 0xd2

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v20

    const/16 v3, 0xd9

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v21

    filled-new-array/range {v10 .. v21}, [Ljava/lang/Character;

    move-result-object v3

    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/m54;->XX0([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    const/16 v10, 0x105

    invoke-static {v10}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v51

    const/16 v10, 0x107

    invoke-static {v10}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v52

    const/16 v10, 0x119

    invoke-static {v10}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v53

    const/16 v10, 0x142

    invoke-static {v10}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v54

    const/16 v10, 0x144

    invoke-static {v10}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v55

    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v56

    const/16 v6, 0x15b

    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v57

    const/16 v6, 0x17a

    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v58

    const/16 v6, 0x17c

    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v59

    const/16 v6, 0x104

    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v60

    const/16 v6, 0x106

    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v61

    const/16 v6, 0x118

    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v62

    const/16 v6, 0x141

    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v63

    const/16 v6, 0x143

    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v64

    invoke-static/range {v23 .. v23}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v65

    const/16 v6, 0x15a

    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v66

    const/16 v6, 0x179

    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v67

    const/16 v6, 0x17b

    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v68

    filled-new-array/range {v51 .. v68}, [Ljava/lang/Character;

    move-result-object v6

    invoke-static {v6}, Lcom/android/mltcode/paycertificationapi/m54;->XX0([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v6

    invoke-static/range {v40 .. v40}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v10

    invoke-static/range {v41 .. v41}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    invoke-static/range {v50 .. v50}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    const/16 v13, 0xcf

    invoke-static {v13}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v13

    filled-new-array {v10, v11, v12, v13}, [Ljava/lang/Character;

    move-result-object v10

    invoke-static {v10}, Lcom/android/mltcode/paycertificationapi/m54;->XX0([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v10

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v11

    const/4 v12, 0x0

    :goto_0
    const-string v13, "en"

    const-string v14, "ja"

    if-ge v12, v11, :cond_26

    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v15

    const/16 v0, 0x4e00

    if-gt v0, v15, :cond_1

    const v0, 0xa000

    if-ge v15, v0, :cond_1

    const-string v0, "zh"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_1
    const/16 v0, 0x3040

    if-gt v0, v15, :cond_2

    const/16 v0, 0x30a0

    if-ge v15, v0, :cond_2

    invoke-static {v1, v14}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_2
    const/16 v0, 0x30a0

    if-gt v0, v15, :cond_3

    const/16 v0, 0x3100

    if-ge v15, v0, :cond_3

    invoke-static {v1, v14}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_3
    const v0, 0xac00

    if-gt v0, v15, :cond_4

    const v0, 0xd7b0

    if-ge v15, v0, :cond_4

    const-string v0, "ko"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_4
    const/16 v0, 0x400

    if-gt v0, v15, :cond_5

    const/16 v0, 0x500

    if-ge v15, v0, :cond_5

    const-string v0, "ru"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_5
    const/16 v0, 0x370

    if-gt v0, v15, :cond_6

    const/16 v0, 0x400

    if-ge v15, v0, :cond_6

    const-string v0, "el"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_6
    const/16 v0, 0x600

    if-gt v0, v15, :cond_7

    const/16 v0, 0x700

    if-ge v15, v0, :cond_7

    const-string v0, "ar"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_7
    const/16 v0, 0x590

    if-gt v0, v15, :cond_8

    const/16 v0, 0x600

    if-ge v15, v0, :cond_8

    const-string v0, "he"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_8
    const/16 v0, 0xe00

    if-gt v0, v15, :cond_9

    const/16 v0, 0xe80

    if-ge v15, v0, :cond_9

    const-string v0, "th"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_9
    const/16 v0, 0xe80

    if-gt v0, v15, :cond_a

    const/16 v0, 0xf00

    if-ge v15, v0, :cond_a

    const-string v0, "lo"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_a
    const/16 v0, 0x1000

    if-gt v0, v15, :cond_b

    const/16 v0, 0x10a0

    if-ge v15, v0, :cond_b

    const-string v0, "my"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_b
    const/16 v0, 0x10a0

    if-gt v0, v15, :cond_c

    const/16 v0, 0x1100

    if-ge v15, v0, :cond_c

    const-string v0, "ka"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_c
    const/16 v0, 0x530

    if-gt v0, v15, :cond_d

    const/16 v0, 0x590

    if-ge v15, v0, :cond_d

    const-string v0, "hy"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_d
    const/16 v0, 0x1780

    if-gt v0, v15, :cond_e

    const/16 v0, 0x1800

    if-ge v15, v0, :cond_e

    const-string v0, "km"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_e
    const/16 v0, 0x900

    if-gt v0, v15, :cond_f

    const/16 v0, 0x980

    if-ge v15, v0, :cond_f

    const-string v0, "hi"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_f
    const/16 v0, 0x980

    if-gt v0, v15, :cond_10

    const/16 v0, 0xa00

    if-ge v15, v0, :cond_10

    const-string v0, "bn"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_10
    const/16 v0, 0xa00

    if-gt v0, v15, :cond_11

    const/16 v0, 0xa80

    if-ge v15, v0, :cond_11

    const-string v0, "pa"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_11
    const/16 v0, 0xa80

    if-gt v0, v15, :cond_12

    const/16 v0, 0xb00

    if-ge v15, v0, :cond_12

    const-string v0, "gu"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_12
    const/16 v0, 0xb00

    if-gt v0, v15, :cond_13

    const/16 v0, 0xb80

    if-ge v15, v0, :cond_13

    const-string v0, "or"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_13
    const/16 v0, 0xb80

    if-gt v0, v15, :cond_14

    const/16 v0, 0xc00

    if-ge v15, v0, :cond_14

    const-string v0, "ta"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_14
    const/16 v0, 0xc00

    if-gt v0, v15, :cond_15

    const/16 v0, 0xc80

    if-ge v15, v0, :cond_15

    const-string v0, "te"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_15
    const/16 v0, 0xc80

    if-gt v0, v15, :cond_16

    const/16 v0, 0xd00

    if-ge v15, v0, :cond_16

    const-string v0, "kn"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_16
    const/16 v0, 0xd00

    if-gt v0, v15, :cond_17

    const/16 v0, 0xd80

    if-ge v15, v0, :cond_17

    const-string v0, "ml"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_17
    const/16 v0, 0xd80

    if-gt v0, v15, :cond_18

    const/16 v0, 0xe00

    if-ge v15, v0, :cond_18

    const-string v0, "si"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_18
    invoke-static {v15}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    const-string v0, "de"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_19
    invoke-static {v15}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    const-string v0, "fr"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_1a
    invoke-static {v15}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    const-string v0, "es"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_1b
    invoke-static {v15}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    const-string v0, "pt"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_1c
    invoke-static {v15}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1d

    const-string v0, "tr"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_1d
    invoke-static {v15}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1e

    const-string v0, "it"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_1e
    invoke-static {v15}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1f

    const-string v0, "pl"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_1f
    invoke-static {v15}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_20

    const-string v0, "nl"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_20
    if-ltz v15, :cond_21

    const/16 v0, 0x80

    if-ge v15, v0, :cond_21

    invoke-static {v1, v13}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_21
    const/16 v0, 0x80

    if-gt v0, v15, :cond_22

    const/16 v0, 0x100

    if-ge v15, v0, :cond_22

    invoke-static {v15}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_25

    invoke-static {v15}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_25

    invoke-static {v15}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_25

    invoke-static {v15}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_25

    invoke-static {v15}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_25

    invoke-static {v15}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_25

    invoke-static {v15}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_25

    invoke-static {v15}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_25

    invoke-static {v1, v13}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    goto :goto_2

    :cond_22
    const/16 v0, 0x1e00

    if-gt v0, v15, :cond_23

    const/16 v0, 0x1f00

    if-ge v15, v0, :cond_23

    goto :goto_1

    :cond_23
    const/16 v0, 0x1a0

    if-eq v15, v0, :cond_24

    const/16 v0, 0x1a1

    if-eq v15, v0, :cond_24

    const/16 v0, 0x1af

    if-eq v15, v0, :cond_24

    const/16 v0, 0x1b0

    if-eq v15, v0, :cond_24

    const/16 v0, 0xd0

    if-eq v15, v0, :cond_24

    const/16 v0, 0x110

    if-ne v15, v0, :cond_25

    :cond_24
    :goto_1
    const-string v0, "vi"

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->inc(Ljava/util/Map;Ljava/lang/String;)V

    :cond_25
    :goto_2
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v0, p0

    goto/16 :goto_0

    :cond_26
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_27

    const/4 v0, 0x0

    goto :goto_4

    :cond_27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_28

    :goto_3
    move-object v0, v1

    goto :goto_4

    :cond_28
    move-object v3, v1

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    :cond_29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    if-ge v3, v5, :cond_2a

    move-object v1, v4

    move v3, v5

    :cond_2a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_29

    goto :goto_3

    :goto_4
    check-cast v0, Ljava/util/Map$Entry;

    if-eqz v0, :cond_2b

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_5

    :cond_2b
    const/4 v0, 0x0

    :goto_5
    if-eqz v0, :cond_4d

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_6

    :sswitch_0
    const-string v1, "zh"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2c

    goto/16 :goto_6

    :cond_2c
    const-string v0, "zh-CN"

    return-object v0

    :sswitch_1
    const-string v1, "vi"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2d

    goto/16 :goto_6

    :cond_2d
    const-string v0, "vi-VN"

    return-object v0

    :sswitch_2
    const-string v1, "tr"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2e

    goto/16 :goto_6

    :cond_2e
    const-string v0, "tr-TR"

    return-object v0

    :sswitch_3
    const-string v1, "th"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2f

    goto/16 :goto_6

    :cond_2f
    const-string v0, "th-TH"

    return-object v0

    :sswitch_4
    const-string v1, "te"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_30

    goto/16 :goto_6

    :cond_30
    const-string v0, "te-IN"

    return-object v0

    :sswitch_5
    const-string v1, "ta"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_31

    goto/16 :goto_6

    :cond_31
    const-string v0, "ta-IN"

    return-object v0

    :sswitch_6
    const-string v1, "si"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_32

    goto/16 :goto_6

    :cond_32
    const-string v0, "si-LK"

    return-object v0

    :sswitch_7
    const-string v1, "ru"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_33

    goto/16 :goto_6

    :cond_33
    const-string v0, "ru-RU"

    return-object v0

    :sswitch_8
    const-string v1, "pt"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_34

    goto/16 :goto_6

    :cond_34
    const-string v0, "pt-PT"

    return-object v0

    :sswitch_9
    const-string v1, "pl"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_35

    goto/16 :goto_6

    :cond_35
    const-string v0, "pl-PL"

    return-object v0

    :sswitch_a
    const-string v1, "pa"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_36

    goto/16 :goto_6

    :cond_36
    const-string v0, "pa-IN"

    return-object v0

    :sswitch_b
    const-string v1, "or"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_37

    goto/16 :goto_6

    :cond_37
    const-string v0, "or-IN"

    return-object v0

    :sswitch_c
    const-string v1, "nl"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_38

    goto/16 :goto_6

    :cond_38
    const-string v0, "nl-NL"

    return-object v0

    :sswitch_d
    const-string v1, "my"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_39

    goto/16 :goto_6

    :cond_39
    const-string v0, "my-MM"

    return-object v0

    :sswitch_e
    const-string v1, "ml"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3a

    goto/16 :goto_6

    :cond_3a
    const-string v0, "ml-IN"

    return-object v0

    :sswitch_f
    const-string v1, "lo"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3b

    goto/16 :goto_6

    :cond_3b
    const-string v0, "lo-LA"

    return-object v0

    :sswitch_10
    const-string v1, "ko"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3c

    goto/16 :goto_6

    :cond_3c
    const-string v0, "ko-KR"

    return-object v0

    :sswitch_11
    const-string v1, "kn"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3d

    goto/16 :goto_6

    :cond_3d
    const-string v0, "kn-IN"

    return-object v0

    :sswitch_12
    const-string v1, "km"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3e

    goto/16 :goto_6

    :cond_3e
    const-string v0, "km-KH"

    return-object v0

    :sswitch_13
    const-string v1, "ka"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3f

    goto/16 :goto_6

    :cond_3f
    const-string v0, "ka-GE"

    return-object v0

    :sswitch_14
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_40

    goto/16 :goto_6

    :cond_40
    const-string v0, "ja-JP"

    return-object v0

    :sswitch_15
    const-string v1, "it"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_41

    goto/16 :goto_6

    :cond_41
    const-string v0, "it-IT"

    return-object v0

    :sswitch_16
    const-string v1, "hy"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_42

    goto/16 :goto_6

    :cond_42
    const-string v0, "hy-AM"

    return-object v0

    :sswitch_17
    const-string v1, "hi"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_43

    goto/16 :goto_6

    :cond_43
    const-string v0, "hi-IN"

    return-object v0

    :sswitch_18
    const-string v1, "he"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_44

    goto :goto_6

    :cond_44
    const-string v0, "he-IL"

    return-object v0

    :sswitch_19
    const-string v1, "gu"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_45

    goto :goto_6

    :cond_45
    const-string v0, "gu-IN"

    return-object v0

    :sswitch_1a
    const-string v1, "fr"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_46

    goto :goto_6

    :cond_46
    const-string v0, "fr-FR"

    return-object v0

    :sswitch_1b
    const-string v1, "es"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_47

    goto :goto_6

    :cond_47
    const-string v0, "es-ES"

    return-object v0

    :sswitch_1c
    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_48

    goto :goto_6

    :cond_48
    const-string v0, "en-US"

    return-object v0

    :sswitch_1d
    const-string v1, "el"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_49

    goto :goto_6

    :cond_49
    const-string v0, "el-GR"

    return-object v0

    :sswitch_1e
    const-string v1, "de"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4a

    goto :goto_6

    :cond_4a
    const-string v0, "de-DE"

    return-object v0

    :sswitch_1f
    const-string v1, "bn"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4b

    goto :goto_6

    :cond_4b
    const-string v0, "bn-BD"

    return-object v0

    :sswitch_20
    const-string v1, "ar"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4c

    goto :goto_6

    :cond_4c
    const-string v0, "ar-SA"

    return-object v0

    :cond_4d
    :goto_6
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0xc31 -> :sswitch_20
        0xc4c -> :sswitch_1f
        0xc81 -> :sswitch_1e
        0xca7 -> :sswitch_1d
        0xca9 -> :sswitch_1c
        0xcae -> :sswitch_1b
        0xccc -> :sswitch_1a
        0xcee -> :sswitch_19
        0xcfd -> :sswitch_18
        0xd01 -> :sswitch_17
        0xd11 -> :sswitch_16
        0xd2b -> :sswitch_15
        0xd37 -> :sswitch_14
        0xd56 -> :sswitch_13
        0xd62 -> :sswitch_12
        0xd63 -> :sswitch_11
        0xd64 -> :sswitch_10
        0xd83 -> :sswitch_f
        0xd9f -> :sswitch_e
        0xdac -> :sswitch_d
        0xdbe -> :sswitch_c
        0xde3 -> :sswitch_b
        0xdf1 -> :sswitch_a
        0xdfc -> :sswitch_9
        0xe04 -> :sswitch_8
        0xe43 -> :sswitch_7
        0xe56 -> :sswitch_6
        0xe6d -> :sswitch_5
        0xe71 -> :sswitch_4
        0xe74 -> :sswitch_3
        0xe7e -> :sswitch_2
        0xeb3 -> :sswitch_1
        0xf2e -> :sswitch_0
    .end sparse-switch
.end method

.method public static final getAILanguage(Ljava/lang/String;)Lcom/sma/smartv3/model/LanguageTranslationData;
    .locals 13
    .param p0    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "language"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zh"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/sma/smartv3/model/LanguageTranslationData;

    const p0, 0x7f140d95

    invoke-static {p0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const/16 v10, 0xf0

    const/4 v11, 0x0

    const-string v3, "zh-CN"

    const-string v4, "zh-Hans"

    const-string v5, "zh-CN-XiaoxiaoNeural"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getTranslationLanguageList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/LanguageTranslationData;->getRtasrLanguage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lcom/sma/smartv3/model/LanguageTranslationData;

    if-eqz v1, :cond_3

    return-object v1

    :cond_3
    new-instance v2, Lcom/sma/smartv3/model/LanguageTranslationData;

    const p0, 0x7f140d9c

    invoke-static {p0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    const/16 v11, 0xf0

    const/4 v12, 0x0

    const-string v4, "en-US"

    const-string v5, "en"

    const-string v6, "en-US-AvaMultilingualNeural"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v12}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method public static synthetic getAILanguage$default(Ljava/lang/String;ILjava/lang/Object;)Lcom/sma/smartv3/model/LanguageTranslationData;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getLocalLanguage()Ljava/lang/String;

    move-result-object p0

    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getAILanguage(Ljava/lang/String;)Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p0

    return-object p0
.end method

.method public static final getCallTranslationLanguageList()Ljava/util/List;
    .locals 43
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v2, 0x7f140d95

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const/16 v10, 0xfc

    const/4 v11, 0x0

    const-string v3, "zh-CN"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v3, 0x7f140d9c

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    const/16 v11, 0xfc

    const/4 v12, 0x0

    const-string v4, "en-US"

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v12}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v4, 0x7f140d96

    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v4

    const/16 v12, 0xfc

    const/4 v13, 0x0

    const-string v5, "zh-HK"

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v3 .. v13}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v5, 0x7f140d97

    invoke-static {v5}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v5

    const/16 v13, 0xfc

    const/4 v14, 0x0

    const-string v6, "zh-TW"

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v4 .. v14}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v6, 0x7f140d9d

    invoke-static {v6}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v6

    const/16 v14, 0xfc

    const/4 v15, 0x0

    const-string v7, "en-IN"

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v5 .. v15}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v7, 0x7f140d87

    invoke-static {v7}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v7

    const/16 v15, 0xfc

    const/16 v16, 0x0

    const-string v8, "ar-SA"

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v6 .. v16}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v8, 0x7f140d89

    invoke-static {v8}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v8

    const/16 v16, 0xfc

    const/16 v17, 0x0

    const-string v9, "ar-EG"

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v7 .. v17}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v9, 0x7f140d8a

    invoke-static {v9}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v9

    const/16 v17, 0xfc

    const/16 v18, 0x0

    const-string v10, "ar-JO"

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v8 .. v18}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v10, 0x7f140d88

    invoke-static {v10}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v10

    const/16 v18, 0xfc

    const/16 v19, 0x0

    const-string v11, "ar-AE"

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v9 .. v19}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v11, 0x7f140d8f

    invoke-static {v11}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v11

    const/16 v19, 0xfc

    const/16 v20, 0x0

    const-string v12, "bn-IN"

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v10 .. v20}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v12, 0x7f140d9b

    invoke-static {v12}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v12

    const/16 v20, 0xfc

    const/16 v21, 0x0

    const-string v13, "nl-NL"

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v11 .. v21}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v13, 0x7f140da0

    invoke-static {v13}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v13

    const/16 v21, 0xfc

    const/16 v22, 0x0

    const-string v14, "fil-PH"

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v12 .. v22}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v14, 0x7f140da2

    invoke-static {v14}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v14

    const/16 v22, 0xfc

    const/16 v23, 0x0

    const-string v15, "fr-FR"

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v13 .. v23}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v15, 0x7f140da5

    invoke-static {v15}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v15

    const/16 v23, 0xfc

    const/16 v24, 0x0

    const-string v16, "de-DE"

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v14 .. v24}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v16, 0x7f140da7

    invoke-static/range {v16 .. v16}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v16

    const/16 v24, 0xfc

    const/16 v25, 0x0

    const-string v17, "gu-IN"

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v15 .. v25}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v17, 0x7f140da9

    invoke-static/range {v17 .. v17}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v17

    const/16 v25, 0xfc

    const/16 v26, 0x0

    const-string v18, "he-IL"

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v16 .. v26}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v17, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v18, 0x7f140daa

    invoke-static/range {v18 .. v18}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v18

    const/16 v26, 0xfc

    const/16 v27, 0x0

    const-string v19, "hi-IN"

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v17 .. v27}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v18, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v19, 0x7f140db1

    invoke-static/range {v19 .. v19}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v19

    const/16 v27, 0xfc

    const/16 v28, 0x0

    const-string v20, "it-IT"

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v18 .. v28}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v19, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v20, 0x7f140db2

    invoke-static/range {v20 .. v20}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v20

    const/16 v28, 0xfc

    const/16 v29, 0x0

    const-string v21, "ja-JP"

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v19 .. v29}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v20, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v21, 0x7f140db5

    invoke-static/range {v21 .. v21}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v21

    const/16 v29, 0xfc

    const/16 v30, 0x0

    const-string v22, "kn-IN"

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v20 .. v30}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v21, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v22, 0x7f140db8

    invoke-static/range {v22 .. v22}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v22

    const/16 v30, 0xfc

    const/16 v31, 0x0

    const-string v23, "ko-KR"

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v21 .. v31}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v22, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v23, 0x7f140dbd

    invoke-static/range {v23 .. v23}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v23

    const/16 v31, 0xfc

    const/16 v32, 0x0

    const-string v24, "ms-MY"

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v22 .. v32}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v23, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v24, 0x7f140d9f

    invoke-static/range {v24 .. v24}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v24

    const/16 v32, 0xfc

    const/16 v33, 0x0

    const-string v25, "fa-IR"

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v23 .. v33}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v24, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v25, 0x7f140dc8

    invoke-static/range {v25 .. v25}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v25

    const/16 v33, 0xfc

    const/16 v34, 0x0

    const-string v26, "pt-PT"

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v24 .. v34}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v25, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v26, 0x7f140dcc

    invoke-static/range {v26 .. v26}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v26

    const/16 v34, 0xfc

    const/16 v35, 0x0

    const-string v27, "ru-RU"

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v25 .. v35}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v26, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v27, 0x7f140dd3

    invoke-static/range {v27 .. v27}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v27

    const/16 v35, 0xfc

    const/16 v36, 0x0

    const-string v28, "es-ES"

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    invoke-direct/range {v26 .. v36}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v27, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v28, 0x7f140dd7

    invoke-static/range {v28 .. v28}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v28

    const/16 v36, 0xfc

    const/16 v37, 0x0

    const-string v29, "ta-IN"

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-direct/range {v27 .. v37}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v28, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v29, 0x7f140dd8

    invoke-static/range {v29 .. v29}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v29

    const/16 v37, 0xfc

    const/16 v38, 0x0

    const-string v30, "te-IN"

    const/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    invoke-direct/range {v28 .. v38}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v29, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v30, 0x7f140dd9

    invoke-static/range {v30 .. v30}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v30

    const/16 v38, 0xfc

    const/16 v39, 0x0

    const-string v31, "th-TH"

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    invoke-direct/range {v29 .. v39}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v30, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v31, 0x7f140dda

    invoke-static/range {v31 .. v31}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v31

    const/16 v39, 0xfc

    const/16 v40, 0x0

    const-string v32, "tr-TR"

    const/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    invoke-direct/range {v30 .. v40}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v31, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v32, 0x7f140df4

    invoke-static/range {v32 .. v32}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v32

    const/16 v40, 0xfc

    const/16 v41, 0x0

    const-string v33, "vi-VN"

    const/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    invoke-direct/range {v31 .. v41}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v32, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v33, 0x7f140dac

    invoke-static/range {v33 .. v33}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v33

    const/16 v41, 0xfc

    const/16 v42, 0x0

    const-string v34, "id-ID"

    const/16 v36, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    invoke-direct/range {v32 .. v42}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array/range {v1 .. v32}, [Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public static final getLocalLanguage()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getLanguage(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final getTranslationLanguageASRLanguage(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "rtasrLanguage"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getTranslationLanguageList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/LanguageTranslationData;->getRtasrLanguage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lcom/sma/smartv3/model/LanguageTranslationData;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getAsrLanguage()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_2

    goto :goto_1

    :cond_2
    return-object p0

    :cond_3
    :goto_1
    const-string p0, "zh-cn"

    return-object p0
.end method

.method public static final getTranslationLanguageList()Ljava/util/List;
    .locals 4
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result v1

    const-string v2, "zh-CN-XiaoxiaoNeural"

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    sget-object v0, Lcom/sma/smartv3/model/LanguageTranslationKt;->languageList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getTtsViuceName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->microsoftLanguage()V

    goto :goto_3

    :cond_1
    :goto_0
    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->microsoftLanguage()V

    goto :goto_3

    :cond_2
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lcom/sma/smartv3/model/LanguageTranslationKt;->languageList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getTtsViuceName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "x4_lingxiaolu_en"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->sparkChainLanguage()V

    goto :goto_3

    :cond_4
    :goto_1
    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->sparkChainLanguage()V

    goto :goto_3

    :cond_5
    sget-object v0, Lcom/sma/smartv3/model/LanguageTranslationKt;->languageList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getTtsViuceName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->microsoftLanguage()V

    goto :goto_3

    :cond_7
    :goto_2
    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->microsoftLanguage()V

    :cond_8
    :goto_3
    sget-object v0, Lcom/sma/smartv3/model/LanguageTranslationKt;->languageList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public static final getTranslationLanguageTtsName(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "rtasrLanguage"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getTranslationLanguageList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/LanguageTranslationData;->getRtasrLanguage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lcom/sma/smartv3/model/LanguageTranslationData;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getTtsViuceName()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_2

    goto :goto_1

    :cond_2
    return-object p0

    :cond_3
    :goto_1
    const-string p0, "x4_enus_catherine_profnews"

    return-object p0
.end method

.method public static final inc(Ljava/util/Map;Ljava/lang/String;)V
    .locals 1
    .param p0    # Ljava/util/Map;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final main()V
    .locals 3

    .line 2
    const-string v0, "--- Basic Tests ---"

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 3
    const-string v0, "\u4f60\u597d\u4e16\u754c"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'\u4f60\u597d\u4e16\u754c\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 4
    const-string v0, "Hello World"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'Hello World\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 5
    const-string v0, "\u3053\u3093\u306b\u3061\u306f\u3001\u4e16\u754c"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'\u3053\u3093\u306b\u3061\u306f\u3001\u4e16\u754c\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 6
    const-string v0, "\uc548\ub155\ud558\uc138\uc694 \uc138\uacc4"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'\uc548\ub155\ud558\uc138\uc694 \uc138\uacc4\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 7
    const-string v0, "\u041f\u0440\u0438\u0432\u0435\u0442, \u043c\u0438\u0440!"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'\u041f\u0440\u0438\u0432\u0435\u0442, \u043c\u0438\u0440!\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 8
    const-string v0, "\u0e2a\u0e27\u0e31\u0e2a\u0e14\u0e35\u0e0a\u0e32\u0e27\u0e42\u0e25\u0e01"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'\u0e2a\u0e27\u0e31\u0e2a\u0e14\u0e35\u0e0a\u0e32\u0e27\u0e42\u0e25\u0e01\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 9
    const-string v0, "Bonjour le monde"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'Bonjour le monde\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 10
    const-string v0, "caf\u00e9 au lait"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'caf\u00e9 au lait\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 11
    const-string v0, "Hallo Welt"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'Hallo Welt\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 12
    const-string v0, "Stra\u00dfe des Gl\u00fccks"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'Stra\u00dfe des Gl\u00fccks\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 13
    const-string v0, "Hola Mundo"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'Hola Mundo\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 14
    const-string v0, "\u00bfQu\u00e9 tal?"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'\u00bfQu\u00e9 tal?\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 15
    const-string v0, "Ol\u00e1 Mundo"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'Ol\u00e1 Mundo\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 16
    const-string v0, "Xin ch\u00e0o th\u1ebf gi\u1edbi"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'Xin ch\u00e0o th\u1ebf gi\u1edbi\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 17
    const-string v0, "\n--- Other Script Tests ---"

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 18
    const-string v0, "\u0393\u03b5\u03b9\u03ac \u03c3\u03bf\u03c5 \u039a\u03cc\u03c3\u03bc\u03b5"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'\u0393\u03b5\u03b9\u03ac \u03c3\u03bf\u03c5 \u039a\u03cc\u03c3\u03bc\u03b5\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 19
    const-string v0, "\u0645\u0631\u062d\u0628\u0627 \u0628\u0627\u0644\u0639\u0627\u0644\u0645"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'\u0645\u0631\u062d\u0628\u0627 \u0628\u0627\u0644\u0639\u0627\u0644\u0645\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 20
    const-string v0, "\u05e9\u05dc\u05d5\u05dd \u05e2\u05d5\u05dc\u05dd"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'\u05e9\u05dc\u05d5\u05dd \u05e2\u05d5\u05dc\u05dd\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 21
    const-string v0, "\u0928\u092e\u0938\u094d\u0924\u0947 \u0926\u0941\u0928\u093f\u092f\u093e"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'\u0928\u092e\u0938\u094d\u0924\u0947 \u0926\u0941\u0928\u093f\u092f\u093e\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 22
    const-string v0, "\u09b9\u09cd\u09af\u09be\u09b2\u09cb \u0993\u09af\u09bc\u09be\u09b0\u09cd\u09b2\u09cd\u09a1"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'\u09b9\u09cd\u09af\u09be\u09b2\u09cb \u0993\u09af\u09bc\u09be\u09b0\u09cd\u09b2\u09cd\u09a1\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 23
    const-string v0, "\u0bb5\u0ba3\u0b95\u0bcd\u0b95\u0bae\u0bcd \u0b89\u0bb2\u0b95\u0bae\u0bcd"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'\u0bb5\u0ba3\u0b95\u0bcd\u0b95\u0bae\u0bcd \u0b89\u0bb2\u0b95\u0bae\u0bcd\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 24
    const-string v0, "\u1230\u120b\u121d \u120d\u12d1\u120d"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'\u1230\u120b\u121d \u120d\u12d1\u120d\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 25
    const-string v0, "\u4f60\u597d Hello \u3053\u3093\u306b\u3061\u306f"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'\u4f60\u597d Hello \u3053\u3093\u306b\u3061\u306f\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 26
    const-string v0, "Merhaba D\u00fcnya"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'Merhaba D\u00fcnya\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 27
    const-string v0, "Ciao mondo \u00e8 bello"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'Ciao mondo \u00e8 bello\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 28
    const-string v0, "Witaj \u015bwiecie"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'Witaj \u015bwiecie\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 29
    const-string v0, "Hallo wereld met \u00eben"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'Hallo wereld met \u00eben\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 30
    const-string v0, "\n--- Edge Cases ---"

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 31
    const-string v0, ""

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'\' (Empty string) is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 32
    const-string v0, "12345 @#$%^"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'12345 @#$%^\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 33
    const-string v0, "\u4f60\u597d123"

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->detectLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'\u4f60\u597d123\' is detected as: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic main([Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->main()V

    return-void
.end method

.method private static final microsoftLanguage()V
    .locals 91

    sget-object v0, Lcom/sma/smartv3/model/LanguageTranslationKt;->languageList:Ljava/util/ArrayList;

    new-instance v1, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v2, 0x7f140d95

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const/16 v10, 0xf0

    const/4 v11, 0x0

    const-string v3, "zh-CN"

    const-string v4, "zh-Hans"

    const-string v5, "zh-CN-XiaoxiaoNeural"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v3, 0x7f140d9c

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    const/16 v11, 0xf0

    const/4 v12, 0x0

    const-string v4, "en-US"

    const-string v5, "en"

    const-string v6, "en-US-AvaMultilingualNeural"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v12}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v4, 0x7f140dcc

    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v4

    const/16 v12, 0xf0

    const/4 v13, 0x0

    const-string v5, "ru-RU"

    const-string v6, "ru"

    const-string v7, "ru-RU-SvetlanaNeural"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v3 .. v13}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v5, 0x7f140db8

    invoke-static {v5}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v5

    const/16 v13, 0xf0

    const/4 v14, 0x0

    const-string v6, "ko-KR"

    const-string v7, "ko"

    const-string v8, "ko-KR-SunHiNeural"

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v4 .. v14}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v6, 0x7f140da5

    invoke-static {v6}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v6

    const/16 v14, 0xf0

    const/4 v15, 0x0

    const-string v7, "de-DE"

    const-string v8, "de"

    const-string v9, "de-DE-KatjaNeural"

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v5 .. v15}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v7, 0x7f140db2

    invoke-static {v7}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v7

    const/16 v15, 0xf0

    const/16 v16, 0x0

    const-string v8, "ja-JP"

    const-string v9, "ja"

    const-string v10, "ja-JP-NanamiNeural"

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v6 .. v16}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v8, 0x7f140df4

    invoke-static {v8}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v8

    const/16 v16, 0xf0

    const/16 v17, 0x0

    const-string v9, "vi-VN"

    const-string v10, "vi"

    const-string v11, "vi-VN-HoaiMyNeural"

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v7 .. v17}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v9, 0x7f140d87

    invoke-static {v9}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v9

    const/16 v17, 0xf0

    const/16 v18, 0x0

    const-string v10, "ar-SA"

    const-string v11, "ar"

    const-string v12, "ar-SA-ZariyahNeural"

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v8 .. v18}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v10, 0x7f140dc2

    invoke-static {v10}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v10

    const/16 v18, 0xf0

    const/16 v19, 0x0

    const-string v11, "ne-NP"

    const-string v12, "ne"

    const-string v13, "ne-NP-HemkalaNeural"

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v9 .. v19}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v11, 0x7f140dcb

    invoke-static {v11}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v11

    const/16 v19, 0xf0

    const/16 v20, 0x0

    const-string v12, "ro-RO"

    const-string v13, "ro"

    const-string v14, "ro-RO-AlinaNeural"

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v10 .. v20}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v12, 0x7f140daa

    invoke-static {v12}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v12

    const/16 v20, 0xf0

    const/16 v21, 0x0

    const-string v13, "hi-IN"

    const-string v14, "hi"

    const-string v15, "hi-IN-AaravNeural"

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v11 .. v21}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v13, 0x7f140db6

    invoke-static {v13}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v13

    const/16 v21, 0xf0

    const/16 v22, 0x0

    const-string v14, "kk-KZ"

    const-string v15, "kk"

    const-string v16, "kk-KZ-AigulNeural"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v12 .. v22}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v14, 0x7f140db4

    invoke-static {v14}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v14

    const/16 v22, 0xf0

    const/16 v23, 0x0

    const-string v15, "kk-KZ"

    const-string v16, "kk"

    const-string v17, "kk-KZ-AigulNeural"

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v13 .. v23}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v15, 0x7f140dd5

    invoke-static {v15}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v15

    const/16 v23, 0xf0

    const/16 v24, 0x0

    const-string v16, "sv-SE"

    const-string v17, "sv"

    const-string v18, "sv-SE-SofieNeural"

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v14 .. v24}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v16, 0x7f140dc7

    invoke-static/range {v16 .. v16}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v16

    const/16 v24, 0xf0

    const/16 v25, 0x0

    const-string v17, "pl-PL"

    const-string v18, "pl"

    const-string v19, "pl-PL-AgnieszkaNeural"

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v15 .. v25}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v17, 0x7f140dd1

    invoke-static/range {v17 .. v17}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v17

    const/16 v25, 0xf0

    const/16 v26, 0x0

    const-string v18, "sl-SI"

    const-string v19, "sl"

    const-string v20, "sl-SI-PetraNeural"

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v16 .. v26}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v17, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v18, 0x7f140df6

    invoke-static/range {v18 .. v18}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v18

    const/16 v26, 0xf0

    const/16 v27, 0x0

    const-string v19, "zu-ZA"

    const-string v20, "zu"

    const-string v21, "zu-ZA-ThandoNeural"

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v17 .. v27}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v18, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v19, 0x7f140db9

    invoke-static/range {v19 .. v19}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v19

    const/16 v27, 0xf0

    const/16 v28, 0x0

    const-string v20, "lo-LA"

    const-string v21, "lo"

    const-string v22, "lo-LA-KeomanyNeural"

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v18 .. v28}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v19, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v20, 0x7f140dc3

    invoke-static/range {v20 .. v20}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v20

    const/16 v28, 0xf0

    const/16 v29, 0x0

    const-string v21, "nb-NO"

    const-string v22, "nb"

    const-string v23, "nb-NO-PernilleNeural"

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v19 .. v29}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v20, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v21, 0x7f140da2

    invoke-static/range {v21 .. v21}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v21

    const/16 v29, 0xf0

    const/16 v30, 0x0

    const-string v22, "fr-FR"

    const-string v23, "fr"

    const-string v24, "fr-FR-DeniseNeural"

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v20 .. v30}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v21, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v22, 0x7f140dc8

    invoke-static/range {v22 .. v22}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v22

    const/16 v30, 0xf0

    const/16 v31, 0x0

    const-string v23, "pt-PT"

    const-string v24, "pt"

    const-string v25, "pt-PT-RaquelNeural"

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v21 .. v31}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v22, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v23, 0x7f140d91

    invoke-static/range {v23 .. v23}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v23

    const/16 v31, 0xf0

    const/16 v32, 0x0

    const-string v24, "pt-BR"

    const-string v25, "pt"

    const-string v26, "pt-BR-FranciscaNeural"

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v22 .. v32}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v23, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v24, 0x7f140dd3

    invoke-static/range {v24 .. v24}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v24

    const/16 v32, 0xf0

    const/16 v33, 0x0

    const-string v25, "es-ES"

    const-string v26, "es"

    const-string v27, "es-ES-ElviraNeural"

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v23 .. v33}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v24, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v25, 0x7f140df2

    invoke-static/range {v25 .. v25}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v25

    const/16 v33, 0xf0

    const/16 v34, 0x0

    const-string v26, "ur-IN"

    const-string v27, "ur"

    const-string v28, "ur-IN-GulNeural"

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v24 .. v34}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v25, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v26, 0x7f140dc1

    invoke-static/range {v26 .. v26}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v26

    const/16 v34, 0xf0

    const/16 v35, 0x0

    const-string v27, "mn-MN"

    const-string v28, "mn"

    const-string v29, "mn-MN-YesuiNeural"

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v25 .. v35}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v26, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v27, 0x7f140dc0

    invoke-static/range {v27 .. v27}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v27

    const/16 v35, 0xf0

    const/16 v36, 0x0

    const-string v28, "mr-IN"

    const-string v29, "mr"

    const-string v30, "mr-IN-AarohiNeural"

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    invoke-direct/range {v26 .. v36}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v27, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v28, 0x7f140dc6

    invoke-static/range {v28 .. v28}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v28

    const/16 v36, 0xf0

    const/16 v37, 0x0

    const-string v29, "ps-AF"

    const-string v30, "ps"

    const-string v31, "ps-AF-LatifaNeural"

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-direct/range {v27 .. v37}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v28, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v29, 0x7f140d9f

    invoke-static/range {v29 .. v29}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v29

    const/16 v37, 0xf0

    const/16 v38, 0x0

    const-string v30, "fa-IR"

    const-string v31, "fa"

    const-string v32, "fa-IR-DilaraNeural"

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    invoke-direct/range {v28 .. v38}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v29, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v30, 0x7f140d9a

    invoke-static/range {v30 .. v30}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v30

    const/16 v38, 0xf0

    const/16 v39, 0x0

    const-string v31, "da-DK"

    const-string v32, "da"

    const-string v33, "da-DK-ChristelNeural"

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    invoke-direct/range {v29 .. v39}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v30, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v31, 0x7f140dad

    invoke-static/range {v31 .. v31}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v31

    const/16 v39, 0xf0

    const/16 v40, 0x0

    const-string v32, "id-ID"

    const-string v33, "id"

    const-string v34, "x2_IdId_Fira"

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    invoke-direct/range {v30 .. v40}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v31, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v32, 0x7f140dab

    invoke-static/range {v32 .. v32}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v32

    const/16 v40, 0xf0

    const/16 v41, 0x0

    const-string v33, "hu-HU"

    const-string v34, "hu"

    const-string v35, "hu-HU-NoemiNeural"

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    invoke-direct/range {v31 .. v41}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v32, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v33, 0x7f140dd8

    invoke-static/range {v33 .. v33}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v33

    const/16 v41, 0xf0

    const/16 v42, 0x0

    const-string v34, "te-IN"

    const-string v35, "te"

    const-string v36, "te-IN-ShrutiNeural"

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    invoke-direct/range {v32 .. v42}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v33, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v34, 0x7f140da9

    invoke-static/range {v34 .. v34}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v34

    const/16 v42, 0xf0

    const/16 v43, 0x0

    const-string v35, "he-IL"

    const-string v36, "he"

    const-string v37, "he-IL-HilaNeural"

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    invoke-direct/range {v33 .. v43}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v34, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v35, 0x7f140db0

    invoke-static/range {v35 .. v35}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v35

    const/16 v43, 0xf0

    const/16 v44, 0x0

    const-string v36, "is-IS"

    const-string v37, "is"

    const-string v38, "is-IS-GudrunNeural"

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    invoke-direct/range {v34 .. v44}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v35, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v36, 0x7f140dd0

    invoke-static/range {v36 .. v36}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v36

    const/16 v44, 0xf0

    const/16 v45, 0x0

    const-string v37, "sk-SK"

    const-string v38, "sk"

    const-string v39, "sk-SK-ViktoriaNeural"

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    invoke-direct/range {v35 .. v45}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v36, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v37, 0x7f140dcd

    invoke-static/range {v37 .. v37}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v37

    const/16 v45, 0xf0

    const/16 v46, 0x0

    const-string v38, "sr-RS"

    const-string v39, "sr-Latn"

    const-string v40, "sr-Latn-RS-NicholasNeural"

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    invoke-direct/range {v36 .. v46}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v37, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v38, 0x7f140da4

    invoke-static/range {v38 .. v38}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v38

    const/16 v46, 0xf0

    const/16 v47, 0x0

    const-string v39, "ka-GE"

    const-string v40, "ka"

    const-string v41, "ka-GE-EkaNeural"

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    invoke-direct/range {v37 .. v47}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v38, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v39, 0x7f140d98

    invoke-static/range {v39 .. v39}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v39

    const/16 v47, 0xf0

    const/16 v48, 0x0

    const-string v40, "hr-HR"

    const-string v41, "hr"

    const-string v42, "hr-HR-GabrijelaNeural"

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    invoke-direct/range {v38 .. v48}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v39, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v40, 0x7f140df3

    invoke-static/range {v40 .. v40}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v40

    const/16 v48, 0xf0

    const/16 v49, 0x0

    const-string v41, "uz-UZ"

    const-string v42, "uz"

    const-string v43, "uz-UZ-MadinaNeural"

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    invoke-direct/range {v39 .. v49}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v40, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v41, 0x7f140dbd

    invoke-static/range {v41 .. v41}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v41

    const/16 v49, 0xf0

    const/16 v50, 0x0

    const-string v42, "ms-MY"

    const-string v43, "ms"

    const-string v44, "ms-MY-YasminNeural"

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    invoke-direct/range {v40 .. v50}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v41, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v42, 0x7f140d92

    invoke-static/range {v42 .. v42}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v42

    const/16 v50, 0xf0

    const/16 v51, 0x0

    const-string v43, "bg-BG"

    const-string v44, "bg"

    const-string v45, "bg-BG-KalinaNeural"

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    invoke-direct/range {v41 .. v51}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v42, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v43, 0x7f140da0

    invoke-static/range {v43 .. v43}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v43

    const/16 v51, 0xf0

    const/16 v52, 0x0

    const-string v44, "fil-PH"

    const-string v45, "fil"

    const-string v46, "fil-PH-BlessicaNeural"

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    invoke-direct/range {v42 .. v52}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v43, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v44, 0x7f140dd7

    invoke-static/range {v44 .. v44}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v44

    const/16 v52, 0xf0

    const/16 v53, 0x0

    const-string v45, "ta-IN"

    const-string v46, "ta"

    const-string v47, "ta-IN-PallaviNeural"

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    invoke-direct/range {v43 .. v53}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v44, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v45, 0x7f140dda

    invoke-static/range {v45 .. v45}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v45

    const/16 v53, 0xf0

    const/16 v54, 0x0

    const-string v46, "tr-TR"

    const-string v47, "tr"

    const-string v48, "tr-TR-EmelNeural"

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    invoke-direct/range {v44 .. v54}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v45, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v46, 0x7f140dd4

    invoke-static/range {v46 .. v46}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v46

    const/16 v54, 0xf0

    const/16 v55, 0x0

    const-string v47, "sw-KE"

    const-string v48, "sw"

    const-string v49, "sw-KE-ZuriNeural"

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    invoke-direct/range {v45 .. v55}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v46, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v47, 0x7f140d9b

    invoke-static/range {v47 .. v47}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v47

    const/16 v55, 0xf0

    const/16 v56, 0x0

    const-string v48, "nl-NL"

    const-string v49, "nl"

    const-string v50, "nl-NL-FennaNeural"

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    invoke-direct/range {v46 .. v56}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v47, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v48, 0x7f140da1

    invoke-static/range {v48 .. v48}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v48

    const/16 v56, 0xf0

    const/16 v57, 0x0

    const-string v49, "fi-FI"

    const-string v50, "fi"

    const-string v51, "fi-FI-SelmaNeural"

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    invoke-direct/range {v47 .. v57}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v48, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v49, 0x7f140d94

    invoke-static/range {v49 .. v49}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v49

    const/16 v57, 0xf0

    const/16 v58, 0x0

    const-string v50, "ca-ES"

    const-string v51, "ca"

    const-string v52, "ca-ES-JoanaNeural"

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    invoke-direct/range {v48 .. v58}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v49, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v50, 0x7f140d8d

    invoke-static/range {v50 .. v50}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v50

    const/16 v58, 0xf0

    const/16 v59, 0x0

    const-string v51, "az-AZ"

    const-string v52, "az"

    const-string v53, "az-AZ-BanuNeural"

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    invoke-direct/range {v49 .. v59}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v50, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v51, 0x7f140d84

    invoke-static/range {v51 .. v51}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v51

    const/16 v59, 0xf8

    const/16 v60, 0x0

    const-string v52, "af-ZA"

    const-string v53, "af"

    const/16 v54, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    invoke-direct/range {v50 .. v60}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v51, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v52, 0x7f140d86

    invoke-static/range {v52 .. v52}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v52

    const/16 v60, 0xf0

    const/16 v61, 0x0

    const-string v53, "am-ET"

    const-string v54, "am"

    const-string v55, "am-ET-MekdesNeural"

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    invoke-direct/range {v51 .. v61}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v52, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v53, 0x7f140d99

    invoke-static/range {v53 .. v53}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v53

    const/16 v61, 0xf0

    const/16 v62, 0x0

    const-string v54, "cs-CZ"

    const-string v55, "cs"

    const-string v56, "cs-CZ-VlastaNeural"

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    invoke-direct/range {v52 .. v62}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v53, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v54, 0x7f140db1

    invoke-static/range {v54 .. v54}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v54

    const/16 v62, 0xf0

    const/16 v63, 0x0

    const-string v55, "it-IT"

    const-string v56, "it"

    const-string v57, "it-IT-ElsaNeural"

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    invoke-direct/range {v53 .. v63}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v54, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v55, 0x7f140dd9

    invoke-static/range {v55 .. v55}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v55

    const/16 v63, 0xf0

    const/16 v64, 0x0

    const-string v56, "th-TH"

    const-string v57, "th"

    const-string v58, "th-TH-PremwadeeNeural"

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    invoke-direct/range {v54 .. v64}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v55, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v56, 0x7f140d8b

    invoke-static/range {v56 .. v56}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v56

    const/16 v64, 0xf0

    const/16 v65, 0x0

    const-string v57, "hy-AM"

    const-string v58, "hy"

    const-string v59, "hy-AM-AnahitNeural"

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    invoke-direct/range {v55 .. v65}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v56, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v57, 0x7f140dcf

    invoke-static/range {v57 .. v57}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v57

    const/16 v65, 0xf0

    const/16 v66, 0x0

    const-string v58, "si-LK"

    const-string v59, "si"

    const-string v60, "si-LK-ThiliniNeural"

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    invoke-direct/range {v56 .. v66}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v57, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v58, 0x7f140d8f

    invoke-static/range {v58 .. v58}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v58

    const/16 v66, 0xf0

    const/16 v67, 0x0

    const-string v59, "bn-IN"

    const-string v60, "bn"

    const-string v61, "bn-IN-TanishaaNeural"

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    invoke-direct/range {v57 .. v67}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v58, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v59, 0x7f140d93

    invoke-static/range {v59 .. v59}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v59

    const/16 v67, 0xf0

    const/16 v68, 0x0

    const-string v60, "my-MM"

    const-string v61, "my"

    const-string v62, "my-MM-NilarNeural"

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    invoke-direct/range {v58 .. v68}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v59, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v60, 0x7f140ddc

    invoke-static/range {v60 .. v60}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v60

    const/16 v68, 0xf0

    const/16 v69, 0x0

    const-string v61, "uk-UA"

    const-string v62, "uk"

    const-string v63, "uk-UA-PolinaNeural"

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    invoke-direct/range {v59 .. v69}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v60, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v61, 0x7f140dbe

    invoke-static/range {v61 .. v61}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v61

    const/16 v69, 0xf0

    const/16 v70, 0x0

    const-string v62, "ml-IN"

    const-string v63, "ml"

    const-string v64, "ml-IN-SobhanaNeural"

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    invoke-direct/range {v60 .. v70}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v61, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v62, 0x7f140dba

    invoke-static/range {v62 .. v62}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v62

    const/16 v70, 0xf0

    const/16 v71, 0x0

    const-string v63, "lv-LV"

    const-string v64, "lv"

    const-string v65, "lv-LV-EveritaNeural"

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    invoke-direct/range {v61 .. v71}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v62, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v63, 0x7f140dbb

    invoke-static/range {v63 .. v63}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v63

    const/16 v71, 0xf0

    const/16 v72, 0x0

    const-string v64, "lt-LT"

    const-string v65, "lt"

    const-string v66, "lt-LT-OnaNeural"

    const/16 v68, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    invoke-direct/range {v62 .. v72}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v63, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v64, 0x7f140db7

    invoke-static/range {v64 .. v64}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v64

    const/16 v72, 0xf0

    const/16 v73, 0x0

    const-string v65, "km-KH"

    const-string v66, "km"

    const-string v67, "km-KH-SreymomNeural"

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    invoke-direct/range {v63 .. v73}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v64, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v65, 0x7f140da6

    invoke-static/range {v65 .. v65}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v65

    const/16 v73, 0xf0

    const/16 v74, 0x0

    const-string v66, "el-GR"

    const-string v67, "el"

    const-string v68, "el-GR-AthinaNeural"

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    invoke-direct/range {v64 .. v74}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v65, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v66, 0x7f140d8c

    invoke-static/range {v66 .. v66}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v66

    const/16 v74, 0xf0

    const/16 v75, 0x0

    const-string v67, "as-IN"

    const-string v68, "as"

    const-string v69, "as-IN-YashicaNeural"

    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

    invoke-direct/range {v65 .. v75}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v66, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v67, 0x7f140d90

    invoke-static/range {v67 .. v67}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v67

    const/16 v75, 0xf0

    const/16 v76, 0x0

    const-string v68, "bs-BA"

    const-string v69, "bs"

    const-string v70, "bs-BA-VesnaNeural"

    const/16 v72, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    invoke-direct/range {v66 .. v76}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v67, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v68, 0x7f140df5

    invoke-static/range {v68 .. v68}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v68

    const/16 v76, 0xf0

    const/16 v77, 0x0

    const-string v69, "cy-GB"

    const-string v70, "cy"

    const-string v71, "cy-GB-NiaNeural"

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    invoke-direct/range {v67 .. v77}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v68, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v69, 0x7f140d9e

    invoke-static/range {v69 .. v69}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v69

    const/16 v77, 0xf0

    const/16 v78, 0x0

    const-string v70, "et-EE"

    const-string v71, "et"

    const-string v72, "et-EE-AnuNeural"

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    invoke-direct/range {v68 .. v78}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v69, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v70, 0x7f140d8e

    invoke-static/range {v70 .. v70}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v70

    const/16 v78, 0xf0

    const/16 v79, 0x0

    const-string v71, "eu-ES"

    const-string v72, "eu"

    const-string v73, "eu-ES-AinhoaNeural"

    const/16 v75, 0x0

    const/16 v76, 0x0

    const/16 v77, 0x0

    invoke-direct/range {v69 .. v79}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v70, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v71, 0x7f140dae

    invoke-static/range {v71 .. v71}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v71

    const/16 v79, 0xf0

    const/16 v80, 0x0

    const-string v72, "ga-IE"

    const-string v73, "ga"

    const-string v74, "ga-IE-OrlaNeural"

    const/16 v76, 0x0

    const/16 v77, 0x0

    const/16 v78, 0x0

    invoke-direct/range {v70 .. v80}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v71, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v72, 0x7f140da3

    invoke-static/range {v72 .. v72}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v72

    const/16 v80, 0xf0

    const/16 v81, 0x0

    const-string v73, "gl-ES"

    const-string v74, "gl"

    const-string v75, "gl-ES-SabelaNeural"

    const/16 v77, 0x0

    const/16 v78, 0x0

    const/16 v79, 0x0

    invoke-direct/range {v71 .. v81}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v72, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v73, 0x7f140da7

    invoke-static/range {v73 .. v73}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v73

    const/16 v81, 0xf0

    const/16 v82, 0x0

    const-string v74, "gu-IN"

    const-string v75, "gu"

    const-string v76, "gu-IN-DhwaniNeural"

    const/16 v78, 0x0

    const/16 v79, 0x0

    const/16 v80, 0x0

    invoke-direct/range {v72 .. v82}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v73, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v74, 0x7f140db3

    invoke-static/range {v74 .. v74}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v74

    const/16 v82, 0xf0

    const/16 v83, 0x0

    const-string v75, "jv-ID"

    const-string v76, "jv"

    const-string v77, "jv-ID-SitiNeural"

    const/16 v79, 0x0

    const/16 v80, 0x0

    const/16 v81, 0x0

    invoke-direct/range {v73 .. v83}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v74, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v75, 0x7f140db5

    invoke-static/range {v75 .. v75}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v75

    const/16 v83, 0xf0

    const/16 v84, 0x0

    const-string v76, "kn-IN"

    const-string v77, "kn"

    const-string v78, "kn-IN-SapnaNeural"

    const/16 v80, 0x0

    const/16 v81, 0x0

    const/16 v82, 0x0

    invoke-direct/range {v74 .. v84}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v75, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v76, 0x7f140dbc

    invoke-static/range {v76 .. v76}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v76

    const/16 v84, 0xf0

    const/16 v85, 0x0

    const-string v77, "mk-MK"

    const-string v78, "mk"

    const-string v79, "mk-MK-MarijaNeural"

    const/16 v81, 0x0

    const/16 v82, 0x0

    const/16 v83, 0x0

    invoke-direct/range {v75 .. v85}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v76, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v77, 0x7f140dbf

    invoke-static/range {v77 .. v77}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v77

    const/16 v85, 0xf0

    const/16 v86, 0x0

    const-string v78, "mt-MT"

    const-string v79, "mt"

    const-string v80, "mt-MT-JosephNeural"

    const/16 v82, 0x0

    const/16 v83, 0x0

    const/16 v84, 0x0

    invoke-direct/range {v76 .. v86}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v77, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v78, 0x7f140daf

    invoke-static/range {v78 .. v78}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v78

    const/16 v86, 0xf0

    const/16 v87, 0x0

    const-string v79, "or-IN"

    const-string v80, "or"

    const-string v81, "or-IN-SukantNeural"

    const/16 v83, 0x0

    const/16 v84, 0x0

    const/16 v85, 0x0

    invoke-direct/range {v77 .. v87}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v78, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v79, 0x7f140dc9

    invoke-static/range {v79 .. v79}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v79

    const/16 v87, 0xf0

    const/16 v88, 0x0

    const-string v80, "pa-IN"

    const-string v81, "pa"

    const-string v82, "pa-IN-OjasNeural"

    const/16 v84, 0x0

    const/16 v85, 0x0

    const/16 v86, 0x0

    invoke-direct/range {v78 .. v88}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v79, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v80, 0x7f140dd2

    invoke-static/range {v80 .. v80}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v80

    const/16 v88, 0xf0

    const/16 v89, 0x0

    const-string v81, "so-SO"

    const-string v82, "so"

    const-string v83, "so-SO-UbaxNeural"

    const/16 v85, 0x0

    const/16 v86, 0x0

    const/16 v87, 0x0

    invoke-direct/range {v79 .. v89}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v80, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v81, 0x7f140d85

    invoke-static/range {v81 .. v81}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v81

    const/16 v89, 0xf0

    const/16 v90, 0x0

    const-string v82, "sq-AL"

    const-string v83, "sq"

    const-string v84, "sq-AL-AnilaNeural"

    const/16 v86, 0x0

    const/16 v87, 0x0

    const/16 v88, 0x0

    invoke-direct/range {v80 .. v90}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array/range {v1 .. v80}, [Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private static final sparkChainLanguage()V
    .locals 78

    sget-object v0, Lcom/sma/smartv3/model/LanguageTranslationKt;->languageList:Ljava/util/ArrayList;

    new-instance v1, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v2, 0x7f140d95

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const/16 v10, 0xe0

    const/4 v11, 0x0

    const-string v3, "zh-cn"

    const-string v4, "cn"

    const-string v5, "x4_lingxiaolu_en"

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v3, 0x7f140d9c

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    const/16 v11, 0xe0

    const/4 v12, 0x0

    const-string v4, "en_us"

    const-string v5, "en"

    const-string v6, "x4_enus_catherine_profnews"

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v12}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v4, 0x7f140dcc

    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v4

    const/16 v12, 0xe0

    const/4 v13, 0x0

    const-string v5, "ru-ru"

    const-string v6, "ru"

    const-string v7, "x2_ruru_keshu"

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v3 .. v13}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v5, 0x7f140db8

    invoke-static {v5}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v5

    const/16 v13, 0xe0

    const/4 v14, 0x0

    const-string v6, "ko_kr"

    const-string v7, "ko"

    const-string v8, "x2_kokr_miya"

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v4 .. v14}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v6, 0x7f140da5

    invoke-static {v6}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v6

    const/16 v14, 0xe0

    const/4 v15, 0x0

    const-string v7, "de_DE"

    const-string v8, "de"

    const-string v9, "x2_dede_christiane"

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v5 .. v15}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v7, 0x7f140db2

    invoke-static {v7}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v7

    const/16 v15, 0xe0

    const/16 v16, 0x0

    const-string v8, "ja_jp"

    const-string v9, "ja"

    const-string v10, "x2_jajp_zhongcun"

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v6 .. v16}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v8, 0x7f140df4

    invoke-static {v8}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v8

    const/16 v16, 0xe0

    const/16 v17, 0x0

    const-string v9, "vi_VN"

    const-string v10, "vi"

    const-string v11, "x2_vivn_thuhien"

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v7 .. v17}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v9, 0x7f140d87

    invoke-static {v9}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v9

    const/16 v17, 0xe0

    const/16 v18, 0x0

    const-string v10, "ar_il"

    const-string v11, "ar"

    const-string v12, "x2_aren_rania"

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v8 .. v18}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v10, 0x7f140dc2

    invoke-static {v10}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v10

    const/16 v18, 0xf8

    const/16 v19, 0x0

    const-string v11, "ne_np"

    const-string v12, "ne"

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v9 .. v19}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v11, 0x7f140dcb

    invoke-static {v11}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v11

    const/16 v19, 0xf0

    const/16 v20, 0x0

    const-string v12, "ro_ro"

    const-string v13, "ro"

    const-string v14, "x2_roro_miruna"

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v10 .. v20}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v12, 0x7f140daa

    invoke-static {v12}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v12

    const/16 v20, 0xf0

    const/16 v21, 0x0

    const-string v13, "hi_in"

    const-string v14, "hi"

    const-string v15, "x2_hiin_mohita"

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v11 .. v21}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v13, 0x7f140db6

    invoke-static {v13}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v13

    const/16 v21, 0xf8

    const/16 v22, 0x0

    const-string v14, "kk_KZ"

    const-string v15, "kk"

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v12 .. v22}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v14, 0x7f140db4

    invoke-static {v14}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v14

    const/16 v22, 0xf8

    const/16 v23, 0x0

    const-string v15, "kk_cn"

    const-string v16, "kk"

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v13 .. v23}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v15, 0x7f140dd5

    invoke-static {v15}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v15

    const/16 v23, 0xf0

    const/16 v24, 0x0

    const-string v16, "sv_SE"

    const-string v17, "sv"

    const-string v18, "x2_svse_michaela"

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v14 .. v24}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v16, 0x7f140dc7

    invoke-static/range {v16 .. v16}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v16

    const/16 v24, 0xf0

    const/16 v25, 0x0

    const-string v17, "pl_pl"

    const-string v18, "pl"

    const-string v19, "x2_natali"

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v15 .. v25}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v17, 0x7f140dd1

    invoke-static/range {v17 .. v17}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v17

    const/16 v25, 0xf8

    const/16 v26, 0x0

    const-string v18, "sl_si"

    const-string v19, "sl"

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v16 .. v26}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v17, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v18, 0x7f140df6

    invoke-static/range {v18 .. v18}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v18

    const/16 v26, 0xf8

    const/16 v27, 0x0

    const-string v19, "zu_za"

    const-string v20, "zu"

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v17 .. v27}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v18, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v19, 0x7f140db9

    invoke-static/range {v19 .. v19}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v19

    const/16 v27, 0xf8

    const/16 v28, 0x0

    const-string v20, "lo_LA"

    const-string v21, "lo"

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v18 .. v28}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v19, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v20, 0x7f140dc3

    invoke-static/range {v20 .. v20}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v20

    const/16 v28, 0xf8

    const/16 v29, 0x0

    const-string v21, "nb_NO"

    const-string v22, "nb"

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v19 .. v29}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v20, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v21, 0x7f140da2

    invoke-static/range {v21 .. v21}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v21

    const/16 v29, 0xe0

    const/16 v30, 0x0

    const-string v22, "fr_fr"

    const-string v23, "fr"

    const-string v24, "x2_mariane"

    const/16 v25, 0x1

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v20 .. v30}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v21, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v22, 0x7f140dc8

    invoke-static/range {v22 .. v22}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v22

    const/16 v30, 0xf0

    const/16 v31, 0x0

    const-string v23, "pt_PT"

    const-string v24, "pt"

    const-string v25, "maria"

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v21 .. v31}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v22, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v23, 0x7f140d91

    invoke-static/range {v23 .. v23}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v23

    const/16 v31, 0xf0

    const/16 v32, 0x0

    const-string v24, "pt_BR"

    const-string v25, "pt"

    const-string v26, "sonia"

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v22 .. v32}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v23, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v24, 0x7f140dd3

    invoke-static/range {v24 .. v24}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v24

    const/16 v32, 0xf0

    const/16 v33, 0x0

    const-string v25, "es_es"

    const-string v26, "es"

    const-string v27, "x2_spes_aurora"

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v23 .. v33}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v24, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v25, 0x7f140df2

    invoke-static/range {v25 .. v25}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v25

    const/16 v33, 0xe0

    const/16 v34, 0x0

    const-string v26, "ur_IN"

    const-string v27, "ur"

    const-string v28, "baili"

    const/16 v29, 0x1

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v24 .. v34}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v25, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v26, 0x7f140dc1

    invoke-static/range {v26 .. v26}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v26

    const/16 v34, 0xe8

    const/16 v35, 0x0

    const-string v27, "mn_MN"

    const-string v28, "mn"

    const/16 v29, 0x0

    const/16 v30, 0x1

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v25 .. v35}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v26, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v27, 0x7f140dc0

    invoke-static/range {v27 .. v27}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v27

    const/16 v35, 0xf8

    const/16 v36, 0x0

    const-string v28, "mr_in"

    const-string v29, "mr"

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    invoke-direct/range {v26 .. v36}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v27, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v28, 0x7f140dc6

    invoke-static/range {v28 .. v28}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v28

    const/16 v36, 0xf8

    const/16 v37, 0x0

    const-string v29, "ps_ar"

    const-string v30, "ps"

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-direct/range {v27 .. v37}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v28, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v29, 0x7f140da8

    invoke-static/range {v29 .. v29}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v29

    const/16 v37, 0xf0

    const/16 v38, 0x0

    const-string v30, "ha_NG"

    const-string v31, "ha"

    const-string v32, "x2_hang_zainab"

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    invoke-direct/range {v28 .. v38}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v29, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v30, 0x7f140d9f

    invoke-static/range {v30 .. v30}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v30

    const/16 v38, 0xf0

    const/16 v39, 0x0

    const-string v31, "fa_IR"

    const-string v32, "fa"

    const-string v33, "x2_fair_saheli"

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    invoke-direct/range {v29 .. v39}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v30, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v31, 0x7f140d9a

    invoke-static/range {v31 .. v31}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v31

    const/16 v39, 0xf8

    const/16 v40, 0x0

    const-string v32, "da_DK"

    const-string v33, "da"

    const/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    invoke-direct/range {v30 .. v40}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v31, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v32, 0x7f140dad

    invoke-static/range {v32 .. v32}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v32

    const/16 v40, 0xf0

    const/16 v41, 0x0

    const-string v33, "id_ID"

    const-string v34, "id"

    const-string v35, "x2_IdId_Fira"

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    invoke-direct/range {v31 .. v41}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v32, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v33, 0x7f140dab

    invoke-static/range {v33 .. v33}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v33

    const/16 v41, 0xf8

    const/16 v42, 0x0

    const-string v34, "hu_hu"

    const-string v35, "hu"

    const/16 v36, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    invoke-direct/range {v32 .. v42}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v33, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v34, 0x7f140dd8

    invoke-static/range {v34 .. v34}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v34

    const/16 v42, 0xf8

    const/16 v43, 0x0

    const-string v35, "te_in"

    const-string v36, "te"

    const/16 v37, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    invoke-direct/range {v33 .. v43}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v34, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v35, 0x7f140da9

    invoke-static/range {v35 .. v35}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v35

    const/16 v43, 0xf8

    const/16 v44, 0x0

    const-string v36, "he_il"

    const-string v37, "he"

    const/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    invoke-direct/range {v34 .. v44}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v35, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v36, 0x7f140db0

    invoke-static/range {v36 .. v36}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v36

    const/16 v44, 0xf8

    const/16 v45, 0x0

    const-string v37, "is_IS"

    const-string v38, "is"

    const/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    invoke-direct/range {v35 .. v45}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v36, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v37, 0x7f140dd0

    invoke-static/range {v37 .. v37}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v37

    const/16 v45, 0xf8

    const/16 v46, 0x0

    const-string v38, "sk_sk"

    const-string v39, "sk"

    const/16 v40, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    invoke-direct/range {v36 .. v46}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v37, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v38, 0x7f140dcd

    invoke-static/range {v38 .. v38}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v38

    const/16 v46, 0xf8

    const/16 v47, 0x0

    const-string v39, "sr_RS"

    const-string v40, "sr"

    const/16 v41, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    invoke-direct/range {v37 .. v47}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v38, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v39, 0x7f140da4

    invoke-static/range {v39 .. v39}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v39

    const/16 v47, 0xf8

    const/16 v48, 0x0

    const-string v40, "ka_ge"

    const-string v41, "ka"

    const/16 v42, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    invoke-direct/range {v38 .. v48}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v39, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v40, 0x7f140d98

    invoke-static/range {v40 .. v40}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v40

    const/16 v48, 0xf8

    const/16 v49, 0x0

    const-string v41, "hr_hr"

    const-string v42, "hr"

    const/16 v43, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    invoke-direct/range {v39 .. v49}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v40, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v41, 0x7f140df3

    invoke-static/range {v41 .. v41}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v41

    const/16 v49, 0xf0

    const/16 v50, 0x0

    const-string v42, "uz_UZ"

    const-string v43, "uz"

    const-string v44, "x2_uzuz_nigina"

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    invoke-direct/range {v40 .. v50}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v41, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v42, 0x7f140dbd

    invoke-static/range {v42 .. v42}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v42

    const/16 v50, 0xf0

    const/16 v51, 0x0

    const-string v43, "ms_MY"

    const-string v44, "ms"

    const-string v45, "x2_msmy_hashim"

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    invoke-direct/range {v41 .. v51}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v42, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v43, 0x7f140d92

    invoke-static/range {v43 .. v43}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v43

    const/16 v51, 0xf0

    const/16 v52, 0x0

    const-string v44, "bg_bg"

    const-string v45, "bg"

    const-string v46, "x2_bgbg_zlati"

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    invoke-direct/range {v42 .. v52}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v43, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v44, 0x7f140da0

    invoke-static/range {v44 .. v44}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v44

    const/16 v52, 0xf0

    const/16 v53, 0x0

    const-string v45, "fil_PH"

    const-string v46, "tl"

    const-string v47, "x2_tlph_grace"

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    invoke-direct/range {v43 .. v53}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v44, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v45, 0x7f140dd7

    invoke-static/range {v45 .. v45}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v45

    const/16 v53, 0xf0

    const/16 v54, 0x0

    const-string v46, "ta_in"

    const-string v47, "ta"

    const-string v48, "x2_tain_udaya"

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    invoke-direct/range {v44 .. v54}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v45, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v46, 0x7f140dda

    invoke-static/range {v46 .. v46}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v46

    const/16 v54, 0xf0

    const/16 v55, 0x0

    const-string v47, "tr_TR"

    const-string v48, "tr"

    const-string v49, "x2_trtr_ersoy"

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    invoke-direct/range {v45 .. v55}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v46, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v47, 0x7f140dd4

    invoke-static/range {v47 .. v47}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v47

    const/16 v55, 0xf0

    const/16 v56, 0x0

    const-string v48, "sw_KE"

    const-string v49, "sw"

    const-string v50, "x2_swtz_hamdan"

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    invoke-direct/range {v46 .. v56}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v47, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v48, 0x7f140d9b

    invoke-static/range {v48 .. v48}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v48

    const/16 v56, 0xf0

    const/16 v57, 0x0

    const-string v49, "nl_NL"

    const-string v50, "nl"

    const-string v51, "x2_nlnl_robin"

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    invoke-direct/range {v47 .. v57}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v48, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v49, 0x7f140da1

    invoke-static/range {v49 .. v49}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v49

    const/16 v57, 0xf8

    const/16 v58, 0x0

    const-string v50, "fi_fi"

    const-string v51, "fi"

    const/16 v52, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    invoke-direct/range {v48 .. v58}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v49, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v50, 0x7f140d94

    invoke-static/range {v50 .. v50}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v50

    const/16 v58, 0xf8

    const/16 v59, 0x0

    const-string v51, "ca_es"

    const-string v52, "ca"

    const/16 v53, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    invoke-direct/range {v49 .. v59}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v50, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v51, 0x7f140d8d

    invoke-static/range {v51 .. v51}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v51

    const/16 v59, 0xf8

    const/16 v60, 0x0

    const-string v52, "az_AZ"

    const-string v53, "az"

    const/16 v54, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    invoke-direct/range {v50 .. v60}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v51, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v52, 0x7f140d84

    invoke-static/range {v52 .. v52}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v52

    const/16 v60, 0xf8

    const/16 v61, 0x0

    const-string v53, "af_za"

    const-string v54, "af"

    const/16 v55, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    invoke-direct/range {v51 .. v61}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v52, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v53, 0x7f140d86

    invoke-static/range {v53 .. v53}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v53

    const/16 v61, 0xf8

    const/16 v62, 0x0

    const-string v54, "am_et"

    const-string v55, "am"

    const/16 v56, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    invoke-direct/range {v52 .. v62}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v53, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v54, 0x7f140d99

    invoke-static/range {v54 .. v54}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v54

    const/16 v62, 0xf0

    const/16 v63, 0x0

    const-string v55, "cs_CZ"

    const-string v56, "cs"

    const-string v57, "x2_cscz_petra"

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    invoke-direct/range {v53 .. v63}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v54, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v55, 0x7f140db1

    invoke-static/range {v55 .. v55}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v55

    const/16 v63, 0xe0

    const/16 v64, 0x0

    const-string v56, "it_IT"

    const-string v57, "it"

    const-string v58, "x2_itit_anna"

    const/16 v59, 0x1

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    invoke-direct/range {v54 .. v64}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v55, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v56, 0x7f140dd9

    invoke-static/range {v56 .. v56}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v56

    const/16 v64, 0xf0

    const/16 v65, 0x0

    const-string v57, "th_TH"

    const-string v58, "th"

    const-string v59, "yingying"

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    invoke-direct/range {v55 .. v65}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v56, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v57, 0x7f140dd6

    invoke-static/range {v57 .. v57}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v57

    const/16 v65, 0xf8

    const/16 v66, 0x0

    const-string v58, "tg_tg"

    const-string v59, "tg"

    const/16 v60, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    invoke-direct/range {v56 .. v66}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v57, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v58, 0x7f140d8b

    invoke-static/range {v58 .. v58}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v58

    const/16 v66, 0xf8

    const/16 v67, 0x0

    const-string v59, "hy_AM"

    const-string v60, "hy"

    const/16 v61, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    invoke-direct/range {v57 .. v67}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v58, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v59, 0x7f140dcf

    invoke-static/range {v59 .. v59}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v59

    const/16 v67, 0xf8

    const/16 v68, 0x0

    const-string v60, "si_lk"

    const-string v61, "si"

    const/16 v62, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    invoke-direct/range {v58 .. v68}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v59, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v60, 0x7f140d8f

    invoke-static/range {v60 .. v60}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v60

    const/16 v68, 0xf0

    const/16 v69, 0x0

    const-string v61, "bn_BD"

    const-string v62, "bn"

    const-string v63, "x2_bnbd_elmy"

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    invoke-direct/range {v59 .. v69}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v60, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v61, 0x7f140d93

    invoke-static/range {v61 .. v61}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v61

    const/16 v69, 0xf8

    const/16 v70, 0x0

    const-string v62, "my_mm"

    const-string v63, "my"

    const/16 v64, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    invoke-direct/range {v60 .. v70}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v61, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v62, 0x7f140ddc

    invoke-static/range {v62 .. v62}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v62

    const/16 v70, 0xf0

    const/16 v71, 0x0

    const-string v63, "uk_UA"

    const-string v64, "uk"

    const-string v65, "x2_ukua_halyna"

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    invoke-direct/range {v61 .. v71}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v62, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v63, 0x7f140dbe

    invoke-static/range {v63 .. v63}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v63

    const/16 v71, 0xf8

    const/16 v72, 0x0

    const-string v64, "ml_in"

    const-string v65, "ml"

    const/16 v66, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    invoke-direct/range {v62 .. v72}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v63, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v64, 0x7f140dba

    invoke-static/range {v64 .. v64}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v64

    const/16 v72, 0xf8

    const/16 v73, 0x0

    const-string v65, "lv_lv"

    const-string v66, "lv"

    const/16 v67, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    invoke-direct/range {v63 .. v73}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v64, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v65, 0x7f140dbb

    invoke-static/range {v65 .. v65}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v65

    const/16 v73, 0xf8

    const/16 v74, 0x0

    const-string v66, "lt_LT"

    const-string v67, "lt"

    const/16 v68, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    invoke-direct/range {v64 .. v74}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v65, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v66, 0x7f140ddb

    invoke-static/range {v66 .. v66}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v66

    const/16 v74, 0xf8

    const/16 v75, 0x0

    const-string v67, "tm_tk"

    const-string v68, "tm"

    const/16 v69, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

    invoke-direct/range {v65 .. v75}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v66, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v67, 0x7f140db7

    invoke-static/range {v67 .. v67}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v67

    const/16 v75, 0xf8

    const/16 v76, 0x0

    const-string v68, "km_KH"

    const-string v69, "km"

    const/16 v70, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    invoke-direct/range {v66 .. v76}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v67, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v68, 0x7f140da6

    invoke-static/range {v68 .. v68}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v68

    const/16 v76, 0xf0

    const/16 v77, 0x0

    const-string v69, "el_GR"

    const-string v70, "el"

    const-string v71, "x2_elgr_dimitra"

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    invoke-direct/range {v67 .. v77}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array/range {v1 .. v67}, [Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method
