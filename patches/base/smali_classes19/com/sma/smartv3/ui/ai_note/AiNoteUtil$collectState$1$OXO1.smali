.class public final Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectState$1$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IXiXI;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectState$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/IXiXI;"
    }
.end annotation


# static fields
.field public static final IO:Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectState$1$OXO1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectState$1$OXO1<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectState$1$OXO1;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectState$1$OXO1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectState$1$OXO1;->IO:Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectState$1$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p1, :cond_0

    sget-object p1, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->OXO1:Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;

    invoke-static {p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->O10IXXX0X(Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;)Lcom/sma/smartv3/ui/translate/sparkchain/iO;

    move-result-object p2

    new-instance v0, Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10;

    invoke-static {}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->XOO0ii0()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->X1ii()Ljava/lang/String;

    move-result-object v2

    const/16 v10, 0x1fc

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v0 .. v11}, Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/ui/translate/sparkchain/iO;->XOO0ii0(Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10;)V

    invoke-static {}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->O00()Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;

    move-result-object p2

    invoke-static {p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->IO(Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;->XIi00iiXO(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->II1Xi0()Lcom/sma/smartv3/biz/voice/OpusManager;

    move-result-object p1

    invoke-static {}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->IiI10X()Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$callback$1;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/biz/voice/OpusManager;->startDecodeStream(Lcom/sma/smartv3/biz/voice/OpusManager$OnDecodeStreamCallback;)V

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->OXO1:Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;

    invoke-static {p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->O10IXXX0X(Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;)Lcom/sma/smartv3/ui/translate/sparkchain/iO;

    move-result-object p2

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/translate/sparkchain/iO;->I0IIOi()V

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->II1Xi0()Lcom/sma/smartv3/biz/voice/OpusManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/OpusManager;->stopDecodeStream()V

    :goto_0
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectState$1$OXO1;->OXO1(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
