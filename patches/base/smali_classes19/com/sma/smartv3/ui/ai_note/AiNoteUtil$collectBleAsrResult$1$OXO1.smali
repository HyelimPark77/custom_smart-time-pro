.class public final Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IXiXI;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public static final IO:Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1$OXO1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1$OXO1<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1$OXO1;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1$OXO1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1$OXO1;->IO:Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1(Lcom/android/mltcode/paycertificationapi/mq4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/mq4;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->X0O()Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object p2

    invoke-interface {p2}, Lcom/android/mltcode/paycertificationapi/ty0;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/mltcode/paycertificationapi/mq4;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/mq4;->OIi0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/mq4;->OIi0()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    if-nez v1, :cond_0

    move-object v1, v2

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/mq4;->X1ii()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/mq4;->X1ii()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, v0

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->X0O()Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object p2

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/mq4;->OIX0iXi()Ljava/lang/String;

    move-result-object v7

    new-instance v4, Lcom/android/mltcode/paycertificationapi/mq4;

    const/16 v11, 0x29

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Lcom/android/mltcode/paycertificationapi/mq4;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, v4}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/mq4;->OIi0()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    invoke-static {p2}, Lcom/android/mltcode/paycertificationapi/xp5;->OXO1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_2
    move-object p2, v0

    :goto_1
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/mq4;->X1ii()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/xp5;->OXO1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_3
    move-object p1, v0

    :goto_2
    sget-object v1, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->OXO1:Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v1, p2, v2, v3, v0}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->iX1O1(Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;Ljava/lang/String;IILjava/lang/Object;)V

    invoke-static {}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->I1XOi1()Z

    move-result p2

    if-nez p2, :cond_4

    const/4 p2, 0x1

    invoke-static {v1, p1, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->IIX1OXO(Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;Ljava/lang/String;I)V

    :cond_4
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/android/mltcode/paycertificationapi/mq4;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1$OXO1;->OXO1(Lcom/android/mltcode/paycertificationapi/mq4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
