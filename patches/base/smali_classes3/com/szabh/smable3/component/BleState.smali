.class public final Lcom/szabh/smable3/component/BleState;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CONNECTED:I = 0x0

.field public static final DISCONNECTED:I = -0x1

.field public static final INSTANCE:Lcom/szabh/smable3/component/BleState;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final READY:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/szabh/smable3/component/BleState;

    invoke-direct {v0}, Lcom/szabh/smable3/component/BleState;-><init>()V

    sput-object v0, Lcom/szabh/smable3/component/BleState;->INSTANCE:Lcom/szabh/smable3/component/BleState;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
