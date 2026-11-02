.class public final Lcom/sma/smartv3/ui/main/NationServerSelectActivity$getNetworkNationData$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/androidnetworking/interfaces/JSONObjectRequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->getNetworkNationData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNationServerSelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NationServerSelectActivity.kt\ncom/sma/smartv3/ui/main/NationServerSelectActivity$getNetworkNationData$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,581:1\n31#2,2:582\n31#2,2:584\n*S KotlinDebug\n*F\n+ 1 NationServerSelectActivity.kt\ncom/sma/smartv3/ui/main/NationServerSelectActivity$getNetworkNationData$1\n*L\n183#1:582,2\n202#1:584,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNationServerSelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NationServerSelectActivity.kt\ncom/sma/smartv3/ui/main/NationServerSelectActivity$getNetworkNationData$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,581:1\n31#2,2:582\n31#2,2:584\n*S KotlinDebug\n*F\n+ 1 NationServerSelectActivity.kt\ncom/sma/smartv3/ui/main/NationServerSelectActivity$getNetworkNationData$1\n*L\n183#1:582,2\n202#1:584,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$getNetworkNationData$1;->OXO1:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/androidnetworking/error/ANError;)V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "NationServerSelectActivity error  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public onResponse(Lorg/json/JSONObject;)V
    .locals 13

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "data"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    const-string v1, "continents"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const-string v3, "code"

    const/4 v4, 0x0

    const-string v5, "optString(...)"

    const-string v6, ""

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v7

    move v8, v4

    :goto_1
    if-ge v8, v7, :cond_2

    invoke-virtual {v1, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v9

    new-instance v10, Lcom/android/mltcode/paycertificationapi/iiXIXiX;

    invoke-virtual {v9, v3, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "i18nKey"

    invoke-virtual {v9, v12, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v10, v11, v9}, Lcom/android/mltcode/paycertificationapi/iiXIXiX;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    invoke-static {v2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->i0I0O111I(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-class v8, Lcom/android/mltcode/paycertificationapi/iiXIXiX;

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "_list"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-instance v9, Lcom/google/gson/Gson;

    invoke-direct {v9}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v9, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v7, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_3

    const-string v2, "countries"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    goto :goto_2

    :cond_3
    move-object p1, v0

    :goto_2
    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    move v7, v4

    :goto_3
    if-ge v7, v2, :cond_6

    invoke-virtual {p1, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v9

    invoke-virtual {v9, v3, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "ct"

    invoke-virtual {v9, v11, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v11, 0x4

    invoke-static {v10, v9, v4, v11, v0}, Lcom/android/mltcode/paycertificationapi/e11;->XIi00iiXO(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/d11;

    move-result-object v9

    iget-object v10, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$getNetworkNationData$1;->OXO1:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    invoke-static {v10}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->access$getCurSelectedItem$p(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Lcom/android/mltcode/paycertificationapi/d11;

    move-result-object v10

    if-eqz v10, :cond_4

    invoke-virtual {v10}, Lcom/android/mltcode/paycertificationapi/d11;->XOO0ii0()Ljava/lang/String;

    move-result-object v10

    goto :goto_4

    :cond_4
    move-object v10, v0

    :goto_4
    invoke-virtual {v9}, Lcom/android/mltcode/paycertificationapi/d11;->XOO0ii0()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    const/4 v10, 0x1

    invoke-virtual {v9, v10}, Lcom/android/mltcode/paycertificationapi/d11;->OIX0iXi(Z)V

    :cond_5
    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_6
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->i0I0O111I(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-class v3, Lcom/android/mltcode/paycertificationapi/d11;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v3, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$getNetworkNationData$1;->OXO1:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->getMNationList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$getNetworkNationData$1;->OXO1:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->getMNationList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$getNetworkNationData$1;->OXO1:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->access$getOriginalNationList$p(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$getNetworkNationData$1;->OXO1:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->access$getOriginalNationList$p(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$getNetworkNationData$1;->OXO1:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->access$notifyDataSetChanged(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V

    return-void
.end method
