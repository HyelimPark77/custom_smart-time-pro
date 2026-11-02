.class public final Lcom/sma/smartv3/model/AIFunctionDataKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAIFunctionData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIFunctionData.kt\ncom/sma/smartv3/model/AIFunctionDataKt\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,265:1\n87#2,7:266\n94#2,3:274\n70#2,7:277\n97#2:284\n1#3:273\n774#4:285\n865#4,2:286\n774#4:288\n865#4,2:289\n*S KotlinDebug\n*F\n+ 1 AIFunctionData.kt\ncom/sma/smartv3/model/AIFunctionDataKt\n*L\n21#1:266,7\n21#1:274,3\n21#1:277,7\n21#1:284\n21#1:273\n26#1:285\n26#1:286,2\n30#1:288\n30#1:289,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAIFunctionData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIFunctionData.kt\ncom/sma/smartv3/model/AIFunctionDataKt\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,265:1\n87#2,7:266\n94#2,3:274\n70#2,7:277\n97#2:284\n1#3:273\n774#4:285\n865#4,2:286\n774#4:288\n865#4,2:289\n*S KotlinDebug\n*F\n+ 1 AIFunctionData.kt\ncom/sma/smartv3/model/AIFunctionDataKt\n*L\n21#1:266,7\n21#1:274,3\n21#1:277,7\n21#1:284\n21#1:273\n26#1:285\n26#1:286,2\n30#1:288\n30#1:289,2\n*E\n"
    }
.end annotation


# direct methods
.method public static final getAIFunction()Ljava/util/List;
    .locals 49
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AIFunction;",
            ">;"
        }
    .end annotation

    sget-object v1, Lcom/sma/smartv3/model/AIFunctionType;->AI:Lcom/sma/smartv3/model/AIFunctionType;

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v0

    const-string v2, "getApp(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->IXI(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f14150d

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v2, v0

    goto :goto_1

    :cond_0
    const v0, 0x7f1402ae

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :goto_1
    const v0, 0x7f1400c7

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v4

    new-instance v12, Landroid/content/Intent;

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v0

    const-class v15, Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-direct {v12, v0, v15}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance v0, Lcom/sma/smartv3/model/AIFunction;

    const/16 v13, 0x3e0

    const/4 v14, 0x0

    const v3, 0x7f08063c

    const v5, 0x7f081212

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    invoke-direct/range {v0 .. v14}, Lcom/sma/smartv3/model/AIFunction;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v17, Lcom/sma/smartv3/model/AIFunctionType;->HEALTH_QA:Lcom/sma/smartv3/model/AIFunctionType;

    const v1, 0x7f140cb2

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v18

    const v1, 0x7f140cb3

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v20

    new-instance v1, Landroid/content/Intent;

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v2

    invoke-direct {v1, v2, v15}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance v16, Lcom/sma/smartv3/model/AIFunction;

    const/16 v29, 0x3e0

    const/16 v30, 0x0

    const v19, 0x7f08064c

    const v21, 0x7f08121b

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x1

    move-object/from16 v28, v1

    invoke-direct/range {v16 .. v30}, Lcom/sma/smartv3/model/AIFunction;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v18, Lcom/sma/smartv3/model/AIFunctionType;->PERSONAL_TRAINER:Lcom/sma/smartv3/model/AIFunctionType;

    const v1, 0x7f1410c6

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v19

    const v1, 0x7f1410c7

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v21

    new-instance v1, Landroid/content/Intent;

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v2

    invoke-direct {v1, v2, v15}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance v17, Lcom/sma/smartv3/model/AIFunction;

    const/16 v30, 0x3e0

    const/16 v31, 0x0

    const v20, 0x7f080655

    const v22, 0x7f081220

    const/16 v23, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x1

    move-object/from16 v29, v1

    invoke-direct/range {v17 .. v31}, Lcom/sma/smartv3/model/AIFunction;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v2, Lcom/sma/smartv3/model/AIFunctionType;->TRAVEL_GUIDES:Lcom/sma/smartv3/model/AIFunctionType;

    const v1, 0x7f1413bd

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    const v1, 0x7f1413be

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v5

    const v1, 0x7f14035e

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v8

    const v1, 0x7f1413c0

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v9

    const v1, 0x7f1400c9

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    const v4, 0x7f1413bf

    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    const v4, 0x7f14148c

    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v11

    new-instance v19, Lcom/sma/smartv3/model/AIFunction;

    const/16 v14, 0x800

    const/4 v15, 0x0

    const v4, 0x7f08065c

    const v6, 0x7f081224

    const v7, 0x7f080626

    const/4 v12, 0x1

    const/4 v13, 0x0

    move-object/from16 v18, v0

    move-object v0, v1

    move-object/from16 v1, v19

    invoke-direct/range {v1 .. v15}, Lcom/sma/smartv3/model/AIFunction;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v20, Lcom/sma/smartv3/model/AIFunctionType;->EAT_HEALTHY:Lcom/sma/smartv3/model/AIFunctionType;

    const v2, 0x7f1404ad

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v21

    const v2, 0x7f1404ae

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v23

    const v2, 0x7f14035e

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v26

    const v2, 0x7f1404b0

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v27

    const v2, 0x7f1400c9

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f1404af

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v28

    const v2, 0x7f1404ad

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v29

    new-instance v19, Lcom/sma/smartv3/model/AIFunction;

    const/16 v32, 0x800

    const/16 v33, 0x0

    const v22, 0x7f080649

    const v24, 0x7f081219

    const v25, 0x7f080624

    const/16 v30, 0x1

    invoke-direct/range {v19 .. v33}, Lcom/sma/smartv3/model/AIFunction;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v21, Lcom/sma/smartv3/model/AIFunctionType;->DEAL_REVIEWS:Lcom/sma/smartv3/model/AIFunctionType;

    const v2, 0x7f1403cf

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v22

    const v2, 0x7f1403d0

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v24

    const v2, 0x7f14035e

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v27

    const v2, 0x7f1403d2

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v28

    const v2, 0x7f1400c9

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f1403d1

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v29

    const v2, 0x7f1403cf

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v30

    new-instance v20, Lcom/sma/smartv3/model/AIFunction;

    const/16 v33, 0xc00

    const/16 v34, 0x0

    const v23, 0x7f080643

    const v25, 0x7f081216

    const v26, 0x7f080628

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v20 .. v34}, Lcom/sma/smartv3/model/AIFunction;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v22, Lcom/sma/smartv3/model/AIFunctionType;->HIGH_EQ_RESPONSE:Lcom/sma/smartv3/model/AIFunctionType;

    const v2, 0x7f140cd6

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v23

    const v2, 0x7f140cd7

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v25

    const v2, 0x7f14035e

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v28

    const v2, 0x7f140cd9

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v29

    const v2, 0x7f1400c9

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f140cd8

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    const v2, 0x7f140cd6

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v31

    new-instance v21, Lcom/sma/smartv3/model/AIFunction;

    const/16 v34, 0xc00

    const/16 v35, 0x0

    const v24, 0x7f08064d

    const v26, 0x7f08121c

    const v27, 0x7f080626

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v21 .. v35}, Lcom/sma/smartv3/model/AIFunction;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v23, Lcom/sma/smartv3/model/AIFunctionType;->SURNAME:Lcom/sma/smartv3/model/AIFunctionType;

    const v2, 0x7f1412e9

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v24

    const v2, 0x7f1412ea

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v26

    const v2, 0x7f14035e

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v29

    const v2, 0x7f1412ec

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v30

    const v2, 0x7f1400c9

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f1412eb

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v31

    const v2, 0x7f1412e9

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v32

    new-instance v22, Lcom/sma/smartv3/model/AIFunction;

    const/16 v35, 0xc00

    const/16 v36, 0x0

    const v25, 0x7f08065a

    const v27, 0x7f081223

    const v28, 0x7f08062a

    const/16 v33, 0x0

    const/16 v34, 0x0

    invoke-direct/range {v22 .. v36}, Lcom/sma/smartv3/model/AIFunction;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v24, Lcom/sma/smartv3/model/AIFunctionType;->PSYCHOLOGICAL_COUNSELOR:Lcom/sma/smartv3/model/AIFunctionType;

    const v2, 0x7f141134

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v25

    const v2, 0x7f141135

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v27

    const v2, 0x7f14035e

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v30

    const v2, 0x7f141137

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v31

    const v2, 0x7f1400c9

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f141136

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v32

    const v2, 0x7f14148b

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v33

    new-instance v23, Lcom/sma/smartv3/model/AIFunction;

    const/16 v36, 0xc00

    const/16 v37, 0x0

    const v26, 0x7f080656

    const v28, 0x7f081221

    const v29, 0x7f080624

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-direct/range {v23 .. v37}, Lcom/sma/smartv3/model/AIFunction;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v25, Lcom/sma/smartv3/model/AIFunctionType;->COMPLIMENT_MASTERS:Lcom/sma/smartv3/model/AIFunctionType;

    const v2, 0x7f140346

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v26

    const v2, 0x7f140347

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v28

    const v2, 0x7f14035e

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v31

    const v2, 0x7f140349

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v32

    const v2, 0x7f1400c9

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f140348

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v33

    const v2, 0x7f141485

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v34

    new-instance v24, Lcom/sma/smartv3/model/AIFunction;

    const/16 v37, 0xc00

    const/16 v38, 0x0

    const v27, 0x7f08063f

    const v29, 0x7f081214

    const v30, 0x7f080628

    const/16 v35, 0x0

    const/16 v36, 0x0

    invoke-direct/range {v24 .. v38}, Lcom/sma/smartv3/model/AIFunction;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v26, Lcom/sma/smartv3/model/AIFunctionType;->APOLOGIZE:Lcom/sma/smartv3/model/AIFunctionType;

    const v2, 0x7f140134

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v27

    const v2, 0x7f140135

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v29

    const v2, 0x7f14035e

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v32

    const v2, 0x7f140137

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v33

    const v2, 0x7f140134

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v35

    const v2, 0x7f1400c9

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f140136

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v34

    new-instance v25, Lcom/sma/smartv3/model/AIFunction;

    const/16 v38, 0xc00

    const/16 v39, 0x0

    const v28, 0x7f08063d

    const v30, 0x7f081213

    const v31, 0x7f080628

    const/16 v36, 0x0

    const/16 v37, 0x0

    invoke-direct/range {v25 .. v39}, Lcom/sma/smartv3/model/AIFunction;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v27, Lcom/sma/smartv3/model/AIFunctionType;->DREAM_INTERPRETATION:Lcom/sma/smartv3/model/AIFunctionType;

    const v2, 0x7f140477

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v28

    const v2, 0x7f140478

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v30

    const v2, 0x7f14035e

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v33

    const v2, 0x7f14047a

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v34

    const v2, 0x7f1400c9

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f140479

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v35

    const v2, 0x7f141487

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v36

    new-instance v26, Lcom/sma/smartv3/model/AIFunction;

    const/16 v39, 0xc00

    const/16 v40, 0x0

    const v29, 0x7f080645

    const v31, 0x7f081217

    const v32, 0x7f080626

    const/16 v37, 0x0

    const/16 v38, 0x0

    invoke-direct/range {v26 .. v40}, Lcom/sma/smartv3/model/AIFunction;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v28, Lcom/sma/smartv3/model/AIFunctionType;->EVENT_PLANNING:Lcom/sma/smartv3/model/AIFunctionType;

    const v2, 0x7f140b55

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v29

    const v2, 0x7f140b56

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v31

    const v2, 0x7f14035e

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v34

    const v2, 0x7f140b58

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v35

    const v2, 0x7f1400c9

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f140b57

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v36

    const v2, 0x7f141488

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v37

    new-instance v27, Lcom/sma/smartv3/model/AIFunction;

    const/16 v40, 0xc00

    const/16 v41, 0x0

    const v30, 0x7f08064a

    const v32, 0x7f08121a

    const v33, 0x7f08062c

    const/16 v38, 0x0

    const/16 v39, 0x0

    invoke-direct/range {v27 .. v41}, Lcom/sma/smartv3/model/AIFunction;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v29, Lcom/sma/smartv3/model/AIFunctionType;->SHORT_VIDEO_SCRIPTS:Lcom/sma/smartv3/model/AIFunctionType;

    const v2, 0x7f14123d

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v30

    const v2, 0x7f14123e

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v32

    const v2, 0x7f14035e

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v35

    const v2, 0x7f141240

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v36

    const v2, 0x7f1400c9

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f14123f

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v37

    const v2, 0x7f14123d

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v38

    new-instance v28, Lcom/sma/smartv3/model/AIFunction;

    const/16 v41, 0xc00

    const/16 v42, 0x0

    const v31, 0x7f080658

    const v33, 0x7f081222

    const v34, 0x7f080628

    const/16 v39, 0x0

    const/16 v40, 0x0

    invoke-direct/range {v28 .. v42}, Lcom/sma/smartv3/model/AIFunction;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v30, Lcom/sma/smartv3/model/AIFunctionType;->E_MARKET_COPY:Lcom/sma/smartv3/model/AIFunctionType;

    const v2, 0x7f140494

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v31

    const v2, 0x7f140495

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v33

    const v2, 0x7f14035e

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v36

    const v2, 0x7f140497

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v37

    const v2, 0x7f1400c9

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f140496

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v38

    const v2, 0x7f140494

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v39

    new-instance v29, Lcom/sma/smartv3/model/AIFunction;

    const/16 v42, 0xc00

    const/16 v43, 0x0

    const v32, 0x7f080647

    const v34, 0x7f081218

    const v35, 0x7f08062c

    const/16 v40, 0x0

    const/16 v41, 0x0

    invoke-direct/range {v29 .. v43}, Lcom/sma/smartv3/model/AIFunction;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v31, Lcom/sma/smartv3/model/AIFunctionType;->DAILY_WEEKLY:Lcom/sma/smartv3/model/AIFunctionType;

    const v2, 0x7f1403a7

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v32

    const v2, 0x7f1403a8

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v34

    const v2, 0x7f14035e

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v37

    const v2, 0x7f1403aa

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v38

    const v2, 0x7f1400c9

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f1403a9

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v39

    const v2, 0x7f141486

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v40

    new-instance v30, Lcom/sma/smartv3/model/AIFunction;

    const/16 v43, 0xc00

    const/16 v44, 0x0

    const v33, 0x7f080641

    const v35, 0x7f081215

    const v36, 0x7f08062a

    const/16 v41, 0x0

    const/16 v42, 0x0

    invoke-direct/range {v30 .. v44}, Lcom/sma/smartv3/model/AIFunction;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v32, Lcom/sma/smartv3/model/AIFunctionType;->MARKET_ANALYSIS:Lcom/sma/smartv3/model/AIFunctionType;

    const v2, 0x7f140e85

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v33

    const v2, 0x7f140e86

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v35

    const v2, 0x7f14035e

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v38

    const v2, 0x7f140e88

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v39

    const v2, 0x7f1400c9

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f140e87

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v40

    const v2, 0x7f141489

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v41

    new-instance v31, Lcom/sma/smartv3/model/AIFunction;

    const/16 v44, 0xc00

    const/16 v45, 0x0

    const v34, 0x7f080651

    const v36, 0x7f08121e

    const v37, 0x7f080624

    const/16 v42, 0x0

    const/16 v43, 0x0

    invoke-direct/range {v31 .. v45}, Lcom/sma/smartv3/model/AIFunction;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v32, v31

    sget-object v34, Lcom/sma/smartv3/model/AIFunctionType;->MOMENTS_COPYWRITING:Lcom/sma/smartv3/model/AIFunctionType;

    const v2, 0x7f140f67

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v35

    const v2, 0x7f140f68

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v37

    const v2, 0x7f14035e

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v40

    const v2, 0x7f140f6a

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v41

    const v2, 0x7f1400c9

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f140f69

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v42

    const v2, 0x7f14148a

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v43

    new-instance v33, Lcom/sma/smartv3/model/AIFunction;

    const/16 v46, 0xc00

    const/16 v47, 0x0

    const v36, 0x7f080653

    const v38, 0x7f08121f

    const v39, 0x7f080624

    const/16 v44, 0x0

    invoke-direct/range {v33 .. v47}, Lcom/sma/smartv3/model/AIFunction;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v35, Lcom/sma/smartv3/model/AIFunctionType;->LITTLE_RED_BOOK_STYLE:Lcom/sma/smartv3/model/AIFunctionType;

    const v2, 0x7f140e1e

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v36

    const v2, 0x7f140e1f

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v38

    const v2, 0x7f14035e

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v41

    const v2, 0x7f140e21

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v42

    const v2, 0x7f1400c9

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f140e20

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v43

    const v0, 0x7f140e1e

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v44

    new-instance v34, Lcom/sma/smartv3/model/AIFunction;

    const/16 v47, 0xc00

    const/16 v48, 0x0

    const v37, 0x7f08064f

    const v39, 0x7f08121d

    const v40, 0x7f08062c

    const/16 v45, 0x0

    const/16 v46, 0x0

    invoke-direct/range {v34 .. v48}, Lcom/sma/smartv3/model/AIFunction;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v31, v17

    move-object/from16 v17, v16

    move-object/from16 v16, v18

    move-object/from16 v18, v31

    move-object/from16 v31, v30

    move-object/from16 v30, v29

    move-object/from16 v29, v28

    move-object/from16 v28, v27

    move-object/from16 v27, v26

    move-object/from16 v26, v25

    move-object/from16 v25, v24

    move-object/from16 v24, v23

    move-object/from16 v23, v22

    move-object/from16 v22, v21

    move-object/from16 v21, v20

    move-object/from16 v20, v19

    move-object/from16 v19, v1

    filled-new-array/range {v16 .. v34}, [Lcom/sma/smartv3/model/AIFunction;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iIiiO([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public static final getAIFunctionByCat(Lcom/sma/smartv3/model/AIFunctionCat;)Ljava/util/List;
    .locals 5
    .param p0    # Lcom/sma/smartv3/model/AIFunctionCat;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/model/AIFunctionCat;",
            ")",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AIFunction;",
            ">;"
        }
    .end annotation

    const-string v0, "cat"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/sma/smartv3/model/AIFunctionDataKt;->getAIFunction()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/sma/smartv3/model/AIFunction;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AIFunction;->isHot()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AIFunction;->getType()Lcom/sma/smartv3/model/AIFunctionType;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AIFunctionType;->getType()I

    move-result v3

    ushr-int/lit8 v3, v3, 0x8

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AIFunctionCat;->getCat()I

    move-result v4

    if-ne v3, v4, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public static final getHotAIFunction()Ljava/util/List;
    .locals 4
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AIFunction;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/sma/smartv3/model/AIFunctionDataKt;->getAIFunction()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/sma/smartv3/model/AIFunction;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AIFunction;->isHot()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public static final toAIFunction(Landroid/app/Activity;Lcom/sma/smartv3/model/AIFunction;)V
    .locals 4
    .param p0    # Landroid/app/Activity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/sma/smartv3/model/AIFunction;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aiFunction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AIFunction;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "mArg3"

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AIFunction;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AIFunction;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v2, "mArg0"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "mArg2"

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/ai/AIAnswerActivity;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
