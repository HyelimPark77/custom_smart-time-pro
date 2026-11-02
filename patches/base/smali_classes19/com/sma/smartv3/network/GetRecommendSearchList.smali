.class public final Lcom/sma/smartv3/network/GetRecommendSearchList;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/network/GetRecommendSearchList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final LANGUAGE:Ljava/lang/String; = "language"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final RECOMMEND_TYPE:Ljava/lang/String; = "recommendType"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/course/appRecommendSearch"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/GetRecommendSearchList;

    invoke-direct {v0}, Lcom/sma/smartv3/network/GetRecommendSearchList;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/GetRecommendSearchList;->INSTANCE:Lcom/sma/smartv3/network/GetRecommendSearchList;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
