.class public final Lcom/sma/smartv3/initializer/BleInitializer$XO0O10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IO0OI;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/initializer/BleInitializer;->Oi1(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/location/CustomLocation;)V
    .locals 8

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v0

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v2

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->OXO1()D

    move-result-wide v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "agpsLocationClient onLocationChange longitude: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", latitude: "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", altitude: "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->OXO1()D

    move-result-wide v0

    const-wide/16 v2, 0x1

    cmpg-double v0, v0, v2

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    new-instance v1, Lcom/szabh/smable3/entity/BleAgpsPrerequisite;

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v3

    double-to-float v3, v3

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->OXO1()D

    move-result-wide v4

    double-to-int p1, v4

    invoke-direct {v1, v2, v3, p1}, Lcom/szabh/smable3/entity/BleAgpsPrerequisite;-><init>(FFI)V

    invoke-static {v0, v1}, Lcom/sma/smartv3/initializer/BleInitializer;->Ii0i(Lcom/sma/smartv3/initializer/BleInitializer;Lcom/szabh/smable3/entity/BleAgpsPrerequisite;)V

    invoke-static {v0}, Lcom/sma/smartv3/initializer/BleInitializer;->IiiXiI0I(Lcom/sma/smartv3/initializer/BleInitializer;)V

    return-void
.end method

.method public onError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "agpsLocationClient onError "

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object p1, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-static {p1}, Lcom/sma/smartv3/initializer/BleInitializer;->IiiXiI0I(Lcom/sma/smartv3/initializer/BleInitializer;)V

    return-void
.end method
