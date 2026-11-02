.class public final Lcom/szabh/smable3/component/BleConnector$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/component/BleConnector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private final context:Landroid/content/Context;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mtu:I

.field private supportFilterEmpty:Z

.field private supportLauncher:Z

.field private supportMtkOta:Z

.field private supportNordicOta:Z

.field private supportRealtekDfu:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/szabh/smable3/component/BleConnector$Builder;->context:Landroid/content/Context;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/szabh/smable3/component/BleConnector$Builder;->supportLauncher:Z

    iput-boolean p1, p0, Lcom/szabh/smable3/component/BleConnector$Builder;->supportFilterEmpty:Z

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/X1i1IX1X;->OXO1()I

    move-result p1

    iput p1, p0, Lcom/szabh/smable3/component/BleConnector$Builder;->mtu:I

    return-void
.end method


# virtual methods
.method public final build()Lcom/szabh/smable3/component/BaseBleConnector;
    .locals 11
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/szabh/smable3/component/BleConnector$Builder;->context:Landroid/content/Context;

    iget-boolean v2, p0, Lcom/szabh/smable3/component/BleConnector$Builder;->supportNordicOta:Z

    iget-boolean v3, p0, Lcom/szabh/smable3/component/BleConnector$Builder;->supportRealtekDfu:Z

    iget-boolean v4, p0, Lcom/szabh/smable3/component/BleConnector$Builder;->supportMtkOta:Z

    iget-boolean v5, p0, Lcom/szabh/smable3/component/BleConnector$Builder;->supportLauncher:Z

    iget-boolean v6, p0, Lcom/szabh/smable3/component/BleConnector$Builder;->supportFilterEmpty:Z

    iget v7, p0, Lcom/szabh/smable3/component/BleConnector$Builder;->mtu:I

    const/16 v9, 0x80

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v10}, Lcom/szabh/smable3/component/BaseBleConnector;->init$default(Lcom/szabh/smable3/component/BaseBleConnector;Landroid/content/Context;ZZZZZILcom/szabh/smable3/component/BaseBleCache;ILjava/lang/Object;)Lcom/szabh/smable3/component/BaseBleConnector;

    move-result-object v0

    return-object v0
.end method

.method public final setMtu(I)Lcom/szabh/smable3/component/BleConnector$Builder;
    .locals 0
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iput p1, p0, Lcom/szabh/smable3/component/BleConnector$Builder;->mtu:I

    return-object p0
.end method

.method public final supportFilterEmpty(Z)Lcom/szabh/smable3/component/BleConnector$Builder;
    .locals 0
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iput-boolean p1, p0, Lcom/szabh/smable3/component/BleConnector$Builder;->supportFilterEmpty:Z

    return-object p0
.end method

.method public final supportLauncher(Z)Lcom/szabh/smable3/component/BleConnector$Builder;
    .locals 0
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iput-boolean p1, p0, Lcom/szabh/smable3/component/BleConnector$Builder;->supportLauncher:Z

    return-object p0
.end method

.method public final supportMtkOta(Z)Lcom/szabh/smable3/component/BleConnector$Builder;
    .locals 0
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iput-boolean p1, p0, Lcom/szabh/smable3/component/BleConnector$Builder;->supportMtkOta:Z

    return-object p0
.end method

.method public final supportNordicOta(Z)Lcom/szabh/smable3/component/BleConnector$Builder;
    .locals 0
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iput-boolean p1, p0, Lcom/szabh/smable3/component/BleConnector$Builder;->supportNordicOta:Z

    return-object p0
.end method

.method public final supportRealtekDfu(Z)Lcom/szabh/smable3/component/BleConnector$Builder;
    .locals 0
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iput-boolean p1, p0, Lcom/szabh/smable3/component/BleConnector$Builder;->supportRealtekDfu:Z

    return-object p0
.end method
