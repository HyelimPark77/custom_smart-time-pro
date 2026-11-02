.class public final Lcom/sma/smartv3/network/GetSNCodeHYKY;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/network/GetSNCodeHYKY;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final MAC:Ljava/lang/String; = "mac"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/kangyang/get/3code"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/GetSNCodeHYKY;

    invoke-direct {v0}, Lcom/sma/smartv3/network/GetSNCodeHYKY;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/GetSNCodeHYKY;->INSTANCE:Lcom/sma/smartv3/network/GetSNCodeHYKY;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
