.class public final Lcom/szabh/smable3/entity/BleIPCICInfo$AntiShakeSensorManufacturer$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/entity/BleIPCICInfo$AntiShakeSensorManufacturer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleIPCInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCICInfo$AntiShakeSensorManufacturer$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n1#2:282\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleIPCInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCICInfo$AntiShakeSensorManufacturer$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n1#2:282\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/szabh/smable3/entity/BleIPCICInfo$AntiShakeSensorManufacturer$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final of(I)Lcom/szabh/smable3/entity/BleIPCICInfo$AntiShakeSensorManufacturer;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {}, Lcom/szabh/smable3/entity/BleIPCICInfo$AntiShakeSensorManufacturer;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/szabh/smable3/entity/BleIPCICInfo$AntiShakeSensorManufacturer;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleIPCICInfo$AntiShakeSensorManufacturer;->getValue()I

    move-result v2

    if-ne v2, p1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lcom/szabh/smable3/entity/BleIPCICInfo$AntiShakeSensorManufacturer;

    if-nez v1, :cond_2

    sget-object p1, Lcom/szabh/smable3/entity/BleIPCICInfo$AntiShakeSensorManufacturer;->UNKNOWN:Lcom/szabh/smable3/entity/BleIPCICInfo$AntiShakeSensorManufacturer;

    return-object p1

    :cond_2
    return-object v1
.end method
