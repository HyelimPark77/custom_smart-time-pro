.class public final Lcom/sma/smartv3/network/GetExternalKey;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/network/GetExternalKey;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final KEY:Ljava/lang/String; = "key"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/key_vault/get"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/GetExternalKey;

    invoke-direct {v0}, Lcom/sma/smartv3/network/GetExternalKey;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/GetExternalKey;->INSTANCE:Lcom/sma/smartv3/network/GetExternalKey;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
