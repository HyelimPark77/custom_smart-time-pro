.class public final Lcom/sma/smartv3/util/tts/ServerTTSStrategy$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/tts/ServerTTSStrategy;->O00(Lcom/sma/smartv3/util/tts/TTSData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/util/tts/ServerTTSStrategy;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/util/tts/ServerTTSStrategy;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/util/tts/ServerTTSStrategy$OXO1;->IO:Lcom/sma/smartv3/util/tts/ServerTTSStrategy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1(Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, Lcom/sma/smartv3/util/tts/ServerTTSStrategy$OXO1;->IO:Lcom/sma/smartv3/util/tts/ServerTTSStrategy;

    invoke-static {p1}, Lcom/sma/smartv3/util/tts/ServerTTSStrategy;->XIi00iiXO(Lcom/sma/smartv3/util/tts/ServerTTSStrategy;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/androidnetworking/AndroidNetworking;->cancel(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/util/tts/ServerTTSStrategy$OXO1;->OXO1(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
