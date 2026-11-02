.class public final Lcom/sma/androidnetworklib/OXO1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final OXO1:Lcom/sma/androidnetworklib/OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static XIi00iiXO:Lokhttp3/OkHttpClient;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/androidnetworklib/OXO1;

    invoke-direct {v0}, Lcom/sma/androidnetworklib/OXO1;-><init>()V

    sput-object v0, Lcom/sma/androidnetworklib/OXO1;->OXO1:Lcom/sma/androidnetworklib/OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic iO(Lcom/sma/androidnetworklib/OXO1;Landroid/app/Application;ZLcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    sget-object p4, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    const-string p5, "DEFAULT"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/sma/androidnetworklib/OXO1;->XIi00iiXO(Landroid/app/Application;ZLcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;)V

    return-void
.end method


# virtual methods
.method public final OXO1()Lokhttp3/OkHttpClient;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/androidnetworklib/OXO1;->XIi00iiXO:Lokhttp3/OkHttpClient;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "okHttpClient"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final XIi00iiXO(Landroid/app/Application;ZLcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;)V
    .locals 4
    .param p1    # Landroid/app/Application;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "app"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "level"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/OkHttpClient;

    invoke-direct {v0}, Lokhttp3/OkHttpClient;-><init>()V

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x3c

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    if-eqz p2, :cond_0

    new-instance p2, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;

    invoke-direct {p2, p4}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;-><init>(Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;)V

    invoke-virtual {p2, p3}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->O00(Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;)Lcom/sma/androidnetworklib/HttpLoggingInterceptor;

    invoke-virtual {v0, p2}, Lokhttp3/OkHttpClient$Builder;->addInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    :cond_0
    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/sma/androidnetworklib/OXO1;->XO0O10(Lokhttp3/OkHttpClient;)V

    invoke-virtual {p0}, Lcom/sma/androidnetworklib/OXO1;->OXO1()Lokhttp3/OkHttpClient;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/androidnetworking/AndroidNetworking;->initialize(Landroid/content/Context;Lokhttp3/OkHttpClient;)V

    return-void
.end method

.method public final XO0O10(Lokhttp3/OkHttpClient;)V
    .locals 1
    .param p1    # Lokhttp3/OkHttpClient;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/sma/androidnetworklib/OXO1;->XIi00iiXO:Lokhttp3/OkHttpClient;

    return-void
.end method
