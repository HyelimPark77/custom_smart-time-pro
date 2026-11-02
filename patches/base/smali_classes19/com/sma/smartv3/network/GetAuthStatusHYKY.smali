.class public final Lcom/sma/smartv3/network/GetAuthStatusHYKY;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/network/GetAuthStatusHYKY$ResStatus;
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/network/GetAuthStatusHYKY;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PHONE:Ljava/lang/String; = "phone"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PROJECTID:Ljava/lang/String; = "projectId"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/kangyang/auth/get"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/GetAuthStatusHYKY;

    invoke-direct {v0}, Lcom/sma/smartv3/network/GetAuthStatusHYKY;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/GetAuthStatusHYKY;->INSTANCE:Lcom/sma/smartv3/network/GetAuthStatusHYKY;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
