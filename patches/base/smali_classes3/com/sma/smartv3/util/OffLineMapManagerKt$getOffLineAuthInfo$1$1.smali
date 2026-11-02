.class public final Lcom/sma/smartv3/util/OffLineMapManagerKt$getOffLineAuthInfo$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/OffLineMapManagerKt;->XO0O10(Ljava/lang/String;Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/sma/smartv3/model/OffLineAuthInfo;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOffLineMapManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OffLineMapManager.kt\ncom/sma/smartv3/util/OffLineMapManagerKt$getOffLineAuthInfo$1$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,190:1\n11#2,2:191\n*S KotlinDebug\n*F\n+ 1 OffLineMapManager.kt\ncom/sma/smartv3/util/OffLineMapManagerKt$getOffLineAuthInfo$1$1\n*L\n171#1:191,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOffLineMapManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OffLineMapManager.kt\ncom/sma/smartv3/util/OffLineMapManagerKt$getOffLineAuthInfo$1$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,190:1\n11#2,2:191\n*S KotlinDebug\n*F\n+ 1 OffLineMapManager.kt\ncom/sma/smartv3/util/OffLineMapManagerKt$getOffLineAuthInfo$1$1\n*L\n171#1:191,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/util/OffLineMapManagerKt$getOffLineAuthInfo$1$1;->OXO1:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/model/OffLineAuthInfo;)V
    .locals 9

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "getOffLineAuthInfo handleResponse"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/util/OffLineMapManagerKt$getOffLineAuthInfo$1$1;->OXO1:Ljava/lang/String;

    new-instance v4, Lcom/szabh/smable3/entity/BleOptionalMapAuthInfo;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/OffLineAuthInfo;->getAuthCode()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v4, v0, p1}, Lcom/szabh/smable3/entity/BleOptionalMapAuthInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->OPTIONAL_MAP_AUTH_INFO:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-class v0, Lcom/szabh/smable3/entity/BleOptionalMapAuthInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v1, v4}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/sma/smartv3/util/OffLineMapManagerKt;->XIi00iiXO(Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getOffLineAuthInfo error = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/OffLineAuthInfo;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/util/OffLineMapManagerKt$getOffLineAuthInfo$1$1;->OXO1(Lcom/sma/smartv3/model/OffLineAuthInfo;)V

    return-void
.end method
